package com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.order_asignator.IOrderAsignator;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.services.IItemService;
import com.restaurant_system.restaurant_system.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController implements IOrderTableController, IOrderFloorController, IOrderBarKitchenController {
    @Autowired
    private IItemService itemService;
    @Autowired
    private IOrderService orderService;
    @Autowired
    private IOrderAsignator orderAsignator;
    @Override
    public void processOrder() {

    }

    @Override
    public void generateOrderFromItems() {
        OrderEntity order = null;
        orderAsignator.asignOrder(order);
    }

    @Override
    public void setOrdersToPaid() {

    }
}
