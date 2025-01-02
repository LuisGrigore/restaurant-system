package com.restaurant_system.restaurant_system.controllers;

import com.restaurant_system.restaurant_system.dtos.table.AddItemsToTableDto;
import com.restaurant_system.restaurant_system.services.api_services.IFloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class FloorController {
    @Autowired
    private IFloorService floorService;

    public void addItemsToTable(AddItemsToTableDto addItemsToTableDto){
        floorService.addItemsToTable(addItemsToTableDto);
    }
    public void processPaiment(int num){
        floorService.processPaiment(num);
    }

}
