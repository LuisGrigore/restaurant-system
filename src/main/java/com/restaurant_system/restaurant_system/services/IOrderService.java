package com.restaurant_system.restaurant_system.services;

import com.restaurant_system.restaurant_system.dtos.order.OrderPostDto;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.model.OrderStatus;

import java.util.List;

public interface IOrderService {
    void addOrder(OrderEntity order);
    void updateOrderStatus(OrderPostDto order, OrderStatus status);

    List<OrderEntity> getAllOrders();
}
