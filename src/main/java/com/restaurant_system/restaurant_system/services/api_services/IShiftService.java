package com.restaurant_system.restaurant_system.services.api_services;

import java.util.Date;

public interface IShiftService {
    void closeShift(Date open, float realValue);
}
