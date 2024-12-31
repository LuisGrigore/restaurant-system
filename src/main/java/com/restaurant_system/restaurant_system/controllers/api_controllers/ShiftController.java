package com.restaurant_system.restaurant_system.controllers.api_controllers;

import com.restaurant_system.restaurant_system.services.IShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class ShiftController {
    @Autowired
    private IShiftService shiftService;

    public void closeShift(Date open, float realValue){
        shiftService.closeShift(open,realValue);
    }
}
