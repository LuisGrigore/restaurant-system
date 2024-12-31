package com.restaurant_system.restaurant_system.controllers.api_controllers;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.impl.BarKitchenController;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import org.springframework.stereotype.Controller;

@Controller
public class KitchenController extends BarKitchenController {
    @Override
    public void sendOrderEvent(OrderEntity order) {

    }
}
