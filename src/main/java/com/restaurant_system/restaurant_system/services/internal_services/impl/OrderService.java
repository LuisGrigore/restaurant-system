package com.restaurant_system.restaurant_system.services.internal_services.impl;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.order_asignator.IOrderAsignator;
import com.restaurant_system.restaurant_system.model.*;
import com.restaurant_system.restaurant_system.repos.IOrderRepos;
import com.restaurant_system.restaurant_system.services.internal_services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderRepos orderRepos;
    @Autowired
    private IOrderAsignator orderAsignator;
    @Override
    public void generateOrders(List<ItemEntity> items, TableEntity table) {
        Map<Type,List<ItemEntity>> sortedItems= new HashMap<>();
        for(ItemEntity item : items){
            if(item != null){
                sortedItems.computeIfAbsent(item.getType(), k -> new ArrayList<>()).add(item);
            }
        }
        for(Type type : sortedItems.keySet()){
            orderAsignator.asignOrder(orderFactory(sortedItems.get(type), type, table));
        }
    }
    private OrderEntity orderFactory(List<ItemEntity> items, Type type, TableEntity table){
        float price = 0;
        for(ItemEntity item : items){
            price += item.getPrice();
        }
        return OrderEntity.builder()
                .type(type)
                .items(items)
                .date(new Date())
                .status(OrderStatus.PLACED)
                .price(price)
                .table(table)
                .build();
    }

    @Override
    public void updateOrderStatus(long id, OrderStatus status) {
        OrderEntity order = orderRepos.findById(id).get();
        order.setStatus(status);
        orderRepos.save(order);
    }


    @Override
    public List<OrderEntity> getAllOrders() {
        return orderRepos.findAll();
    }
}
