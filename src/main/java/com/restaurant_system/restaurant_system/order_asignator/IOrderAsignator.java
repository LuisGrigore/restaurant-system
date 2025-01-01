package com.restaurant_system.restaurant_system.order_asignator;

import com.restaurant_system.restaurant_system.model.OrderEntity;

public interface IOrderAsignator {
    void asignOrder(OrderEntity order);
}
