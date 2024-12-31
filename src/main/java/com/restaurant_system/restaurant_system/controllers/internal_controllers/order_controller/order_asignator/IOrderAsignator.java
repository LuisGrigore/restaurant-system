package com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.order_asignator;

import com.restaurant_system.restaurant_system.model.OrderEntity;

public interface IOrderAsignator {
    void asignOrder(OrderEntity order);
}
