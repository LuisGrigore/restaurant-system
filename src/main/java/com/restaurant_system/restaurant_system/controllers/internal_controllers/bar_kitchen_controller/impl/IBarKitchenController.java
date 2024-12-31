package com.restaurant_system.restaurant_system.controllers.internal_controllers.bar_kitchen_controller.impl;

import com.restaurant_system.restaurant_system.dtos.OrderSendDto;
import com.restaurant_system.restaurant_system.model.OrderEntity;

public interface IBarKitchenController {
    OrderSendDto sendOrderEvent(OrderEntity order);
}
