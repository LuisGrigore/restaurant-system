package com.restaurant_system.restaurant_system.datasources;

import com.restaurant_system.restaurant_system.model.ShiftEntity;

public interface IShiftDatasource {

    void sendShift(ShiftEntity shift);
}
