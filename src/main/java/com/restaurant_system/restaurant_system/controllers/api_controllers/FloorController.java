package com.restaurant_system.restaurant_system.controllers.api_controllers;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderFloorController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller.ITableFloorController;
import com.restaurant_system.restaurant_system.dtos.table.AddItemsToTableDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class FloorController {
    @Autowired
    private IOrderFloorController orderController;
    @Autowired
    private ITableFloorController tableController;

    public void addItemsToTable(AddItemsToTableDto addItemsToTableDto){
        orderController.generateOrders(addItemsToTableDto.getItemNames(), addItemsToTableDto.getTable());
    }
    public void processPaiment(int num){
        tableController.closeTable(num);
    }
}
