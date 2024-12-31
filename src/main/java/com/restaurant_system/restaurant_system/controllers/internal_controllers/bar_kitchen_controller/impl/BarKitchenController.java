package com.restaurant_system.restaurant_system.controllers.internal_controllers.bar_kitchen_controller.impl;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderBarKitchenController;
import com.restaurant_system.restaurant_system.dtos.OrderPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public abstract class BarKitchenController implements IBarKitchenController {
    @Autowired
    private IOrderBarKitchenController orderController;
    protected void processOrder(OrderPostDto order){
        orderController.setOrderStatusReady(order);
    }
}
