package com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller;

import com.restaurant_system.restaurant_system.dtos.order.OrderPostDto;

public interface IOrderBarKitchenController {
    void setOrderStatusReady(OrderPostDto order);
}
