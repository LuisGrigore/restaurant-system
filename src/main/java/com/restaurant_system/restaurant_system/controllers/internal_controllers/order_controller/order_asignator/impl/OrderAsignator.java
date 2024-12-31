package com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.order_asignator.impl;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.bar_kitchen_controller.impl.IBarKitchenController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.order_asignator.IOrderAsignator;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderAsignator implements IOrderAsignator {
    private IBarKitchenController barController;
    private IBarKitchenController kitchenController;
    @Override
    public void asignOrder(OrderEntity order) {
        switch (order.getType()) {
            case BAR -> {
                barController.sendOrderEvent(order);
            }
            case KITCHEN -> {
                kitchenController.sendOrderEvent(order);
            }
        }
    }
}
