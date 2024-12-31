package com.restaurant_system.restaurant_system.controllers.api_controllers;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderFloorController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class FloorController {
    @Autowired
    private IOrderFloorController orderController;
    public void addItemsToTable(List<String> itemNames){
        orderController.generateOrders(itemNames);
    }
    public void processPaiment(){}
}
