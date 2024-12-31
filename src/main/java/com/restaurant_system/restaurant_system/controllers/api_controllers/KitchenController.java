package com.restaurant_system.restaurant_system.controllers.api_controllers;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.bar_kitchen_controller.impl.BarKitchenController;
import com.restaurant_system.restaurant_system.dtos.order.OrderSendDto;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class KitchenController extends BarKitchenController {
    @Override
    //@MessageMapping("/sendOrderToBar")
    @SendTo("/topic/kitchen")
    public OrderSendDto sendOrderEvent(OrderEntity order) {

        return null;
    }
}
