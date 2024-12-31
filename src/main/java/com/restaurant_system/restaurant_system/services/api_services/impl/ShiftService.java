package com.restaurant_system.restaurant_system.services.api_services.impl;

import com.restaurant_system.restaurant_system.datasources.IShiftDatasource;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.dtos.shift.ShiftSendDto;
import com.restaurant_system.restaurant_system.services.api_services.IShiftService;
import com.restaurant_system.restaurant_system.services.internal_services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShiftService implements IShiftService {
    @Autowired
    private IOrderService orderService;
    @Autowired
    private IShiftDatasource shiftDatasource;
    @Override
    public void closeShift(Date open, float realValue) {
        List<OrderEntity> orders= orderService.getAllOrders();
        float totalValue = 0;
        for(OrderEntity order : orders)
        {
            totalValue += order.getPrice();
        }
        float difference = realValue - totalValue;
        ShiftSendDto shift = ShiftSendDto.builder()
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
