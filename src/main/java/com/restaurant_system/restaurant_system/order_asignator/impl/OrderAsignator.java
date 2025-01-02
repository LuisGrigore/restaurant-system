package com.restaurant_system.restaurant_system.order_asignator.impl;

import com.restaurant_system.restaurant_system.order_asignator.IOrderAsignator;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.message_sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderAsignator implements IOrderAsignator {
    @Autowired
    private MessageSender messageSender;
    @Override
    public void asignOrder(OrderEntity order) {
        switch (order.getType()) {
            case BAR -> {
                messageSender.sendOrder("bar",order);
            }
            case KITCHEN -> {
                messageSender.sendOrder("kitchen",order);
            }
        }
    }
}
