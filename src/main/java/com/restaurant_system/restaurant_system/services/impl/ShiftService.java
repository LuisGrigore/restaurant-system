package com.restaurant_system.restaurant_system.services.impl;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderShiftController;
import com.restaurant_system.restaurant_system.datasources.IShiftDatasource;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.model.ShiftEntity;
import com.restaurant_system.restaurant_system.services.IShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShiftService implements IShiftService {
    @Autowired
    private IOrderShiftController orderController;
    @Autowired
    private IShiftDatasource shiftDatasource;
    @Override
    public void closeShift(Date open, float realValue) {
        List<OrderEntity> orders= orderController.getAllCurrentOrders();
        float totalValue = 0;
        for(OrderEntity order : orders)
        {
            totalValue += order.getPrice();
        }
        float difference = realValue - totalValue;
        ShiftEntity shift = ShiftEntity.builder()
                .open(open)
                .close(new Date())
                .orders(orders)
                .totalValue(totalValue)
                .difference(difference)
                .realValue(realValue)
                .build();

        shiftDatasource.sendShift(shift);
    }
}
