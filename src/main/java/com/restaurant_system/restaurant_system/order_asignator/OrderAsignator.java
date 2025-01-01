package com.restaurant_system.restaurant_system.order_asignator;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.order_asignator.IOrderAsignator;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.services.api_services.OrderReciever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderAsignator implements IOrderAsignator {
    private final List<OrderReciever> orderRecievers;
    @Autowired
    public OrderAsignator(List<OrderReciever> orderRecievers) {
        this.orderRecievers = orderRecievers;
    }

    @Override
    public void asignOrder(OrderEntity order) {
        for(OrderReciever reciever : orderRecievers){
            if(order.getType().equals(reciever.getType())){
                reciever.sendOrder(order);
            }
        }
    }
}
