package com.restaurant_system.restaurant_system.datasources;

import com.restaurant_system.restaurant_system.dtos.shift.ShiftSendDto;

public interface IShiftDatasource {

    void sendShift(ShiftSendDto shift);
}
