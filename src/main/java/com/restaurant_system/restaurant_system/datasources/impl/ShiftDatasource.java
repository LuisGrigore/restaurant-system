package com.restaurant_system.restaurant_system.datasources.impl;

import com.restaurant_system.restaurant_system.datasources.IShiftDatasource;
import com.restaurant_system.restaurant_system.dtos.shift.ShiftSendDto;
import org.springframework.stereotype.Component;

@Component
public class ShiftDatasource implements IShiftDatasource {
    @Override
    public void sendShift(ShiftSendDto shift) {

    }
}
