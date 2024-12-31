package com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.impl;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderBarKitchenController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderFloorController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderTableController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.order_asignator.IOrderAsignator;
import com.restaurant_system.restaurant_system.dtos.OrderPostDto;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.model.OrderStatus;
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
    public void setOrderStatusReady(OrderPostDto order) {
        orderService.updateOrderStatus(order, OrderStatus.READY);
    }

    @Override
    public void generateOrderFromItems() {
        OrderEntity order = null;
        orderAsignator.asignOrder(order);
    }

    @Override
    public void setOrdersToPaid(OrderPostDto order) {

    }
}
