package com.restaurant_system.restaurant_system.services.api_services;

import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.model.Type;
import lombok.Data;

@Data
public abstract class OrderReciever {
    private Type type;
    public abstract void sendOrder(OrderEntity order);
}
