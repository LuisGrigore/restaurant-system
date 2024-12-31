package com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.impl;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderBarKitchenController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderFloorController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderShiftController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderTableController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.order_asignator.IOrderAsignator;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller.ITableOrderController;
import com.restaurant_system.restaurant_system.dtos.order.OrderPostDto;
import com.restaurant_system.restaurant_system.model.*;
import com.restaurant_system.restaurant_system.services.IItemService;
import com.restaurant_system.restaurant_system.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.*;

@Controller
public class OrderController implements IOrderTableController, IOrderFloorController, IOrderBarKitchenController, IOrderShiftController {
    @Autowired
    private IItemService itemService;
    @Autowired
    private IOrderService orderService;
    @Autowired
    private IOrderAsignator orderAsignator;
    @Autowired
    private ITableOrderController tableController;
    @Override
    public void setOrderStatusReady(OrderPostDto order) {
        orderService.updateOrderStatus(order, OrderStatus.READY);
    }

    @Override
    public void generateOrders(List<String> itemNames, int tableNum) {
        TableEntity table = tableController.getTableByNum(tableNum);
        Map<Type,List<ItemEntity>> items= new HashMap<>();
        for(String name : itemNames){
            ItemEntity item = itemService.getItemByName(name);
            if(item != null){
                items.computeIfAbsent(item.getType(), k -> new ArrayList<>()).add(item);
            }
        }
        for(Type type : items.keySet()){
            orderAsignator.asignOrder(orderFactory(items.get(type), type, table));
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
    public void setOrdersToPaid(OrderPostDto order) {

    }

    @Override
    public List<OrderEntity> getAllCurrentOrders() {
        return orderService.getAllOrders();
    }
}
