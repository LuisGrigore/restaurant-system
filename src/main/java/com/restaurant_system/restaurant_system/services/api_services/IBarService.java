package com.restaurant_system.restaurant_system.services.api_services;

import com.restaurant_system.restaurant_system.model.OrderEntity;

public interface IBarService {
    void sendOrder(OrderEntity order);
}
