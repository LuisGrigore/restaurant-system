package com.restaurant_system.restaurant_system.services;

import com.restaurant_system.restaurant_system.dtos.OrderPostDto;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.model.OrderStatus;

public interface IOrderService {
    void addOrder(OrderEntity order);
    void updateOrderStatus(OrderPostDto order, OrderStatus status);
}
