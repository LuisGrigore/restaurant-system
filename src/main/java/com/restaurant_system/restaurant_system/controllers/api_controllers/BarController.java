package com.restaurant_system.restaurant_system.controllers.api_controllers;

import com.restaurant_system.restaurant_system.model.OrderStatus;
import com.restaurant_system.restaurant_system.services.internal_services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BarController{
    @Autowired
    private IOrderService orderService;

    public void setOrderToReady(long id){
        orderService.updateOrderStatus(id, OrderStatus.READY);
    }
}
