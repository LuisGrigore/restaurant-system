package com.restaurant_system.restaurant_system.message_sender;

import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.model.TableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageSender {
    @Autowired
    private SimpMessagingTemplate template;

    public void sendOrder(String endpoint, OrderEntity order) {
        template.convertAndSend("/topic/" + endpoint, order);
    }
    public void sendTableUpdate(List<TableEntity> tables) {
        template.convertAndSend("/topic/floor", tables);
    }
}
