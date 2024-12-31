package com.restaurant_system.restaurant_system.services.impl;

import com.restaurant_system.restaurant_system.repos.IShiftRepos;
import com.restaurant_system.restaurant_system.services.IShiftService;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiftService implements IShiftService {
    @Autowired
    private IShiftRepos shiftRepos;
    @Override
    public void createShift() {

    }

    @Override
    public void closeShift(float realValue) {

    }
}
