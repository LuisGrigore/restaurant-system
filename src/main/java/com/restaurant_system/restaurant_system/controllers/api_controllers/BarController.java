package com.restaurant_system.restaurant_system.controllers.api_controllers;

import com.restaurant_system.restaurant_system.controllers.BarKitchenController;
import com.restaurant_system.restaurant_system.dtos.OrderPostDto;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import org.springframework.stereotype.Controller;

@Controller
public class BarController extends BarKitchenController {
    @Override
    public void sendOrderEvent(OrderEntity order) {

    }
}
