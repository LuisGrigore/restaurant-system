package com.restaurant_system.restaurant_system.services.api_services.impl;

import com.restaurant_system.restaurant_system.dtos.order.OrderMessageDto;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.services.api_services.IKitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

public class KitchenService implements IKitchenService {
    @Autowired
    private SimpMessagingTemplate template;

    @Override
    public void sendOrder(OrderEntity order) {
        //ConvertEntity to message
        template.convertAndSend("/topic/kitchen-orders", order);
    }
}
