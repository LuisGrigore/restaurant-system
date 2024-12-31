package com.restaurant_system.restaurant_system.services;

import java.util.Date;

public interface IShiftService {
    void closeShift(Date open, float realValue);
}
