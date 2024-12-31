package com.restaurant_system.restaurant_system.services.impl;

import com.restaurant_system.restaurant_system.dtos.order.OrderPostDto;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.model.OrderStatus;
import com.restaurant_system.restaurant_system.repos.IOrderRepos;
import com.restaurant_system.restaurant_system.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOrderRepos orderRepos;
    @Override
    public void addOrder(OrderEntity order) {

    }

    @Override
    public void updateOrderStatus(OrderPostDto order, OrderStatus status) {

    }

    @Override
    public List<OrderEntity> getAllOrders() {
        return orderRepos.findAll();
    }
}
