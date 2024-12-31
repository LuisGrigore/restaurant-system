package com.restaurant_system.restaurant_system.controllers;

import com.restaurant_system.restaurant_system.model.OrderEntity;

public interface IBarKitchenController {
    void sendOrderEvent(OrderEntity order);
}
