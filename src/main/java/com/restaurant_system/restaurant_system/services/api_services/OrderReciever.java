package com.restaurant_system.restaurant_system.services.api_services;

import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.model.Type;
import lombok.Data;

public interface OrderReciever {
    void sendOrder(OrderEntity order);
}
