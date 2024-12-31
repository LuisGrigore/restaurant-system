package com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller;

import com.restaurant_system.restaurant_system.model.OrderEntity;

import java.util.List;

public interface IOrderShiftController {
    List<OrderEntity> getAllCurrentOrders();
}
