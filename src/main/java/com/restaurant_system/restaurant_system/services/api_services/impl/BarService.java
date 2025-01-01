package com.restaurant_system.restaurant_system.services.api_services.impl;

import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.services.api_services.IBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

public class BarService implements IBarService{
    @Autowired
    private SimpMessagingTemplate template;

    @Override
    public void sendOrder(OrderEntity order) {
        //convert entity to mesage
        template.convertAndSend("/topic/bar-orders", order);
    }
}
