package com.restaurant_system.restaurant_system.services.api_services.impl;

import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.model.Type;
import com.restaurant_system.restaurant_system.services.api_services.IKitchenService;
import com.restaurant_system.restaurant_system.services.api_services.OrderReciever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

public class KitchenService extends OrderReciever implements IKitchenService {
    private final SimpMessagingTemplate template;

    @Autowired
    public KitchenService(SimpMessagingTemplate template) {
        this.template = template;
        super.setType(Type.KITCHEN);
    }

    @Override
    public void sendOrder(OrderEntity order) {
        //ConvertEntity to message
        template.convertAndSend("/topic/kitchen-orders", order);
    }

    @Override
    public Type getType() {
        return super.getType();
    }
}
