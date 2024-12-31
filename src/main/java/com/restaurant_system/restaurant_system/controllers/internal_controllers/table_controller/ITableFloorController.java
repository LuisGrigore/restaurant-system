package com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller;

import com.restaurant_system.restaurant_system.dtos.table.TablePostDto;
import com.restaurant_system.restaurant_system.dtos.table.TableUpdateDto;

public interface ITableFloorController {
    void openTable(TablePostDto table);

    void closeTable(TableUpdateDto table);
}
