package com.restaurant_system.restaurant_system.order_asignator;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.order_asignator.IOrderAsignator;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.services.api_services.IBarService;
import com.restaurant_system.restaurant_system.services.api_services.IKitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderAsignator implements IOrderAsignator {
    @Autowired
    private IBarService barService;
    @Autowired
    private IKitchenService kitchenService;
    @Override
    public void asignOrder(OrderEntity order) {
        switch (order.getType()) {
            case BAR -> {
                barService.sendOrder(order);
            }
            case KITCHEN -> {
                kitchenService.sendOrder(order);
            }
        }
    }
}
