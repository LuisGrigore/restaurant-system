package com.restaurant_system.restaurant_system.services.api_services;

import com.restaurant_system.restaurant_system.dtos.table.AddItemsToTableDto;

public interface IFloorService {
    void addItemsToTable(AddItemsToTableDto addItemsToTableDto);

    void processPaiment(int num);
}
