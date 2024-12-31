package com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller;

import com.restaurant_system.restaurant_system.dtos.TableLayoutDto;
import com.restaurant_system.restaurant_system.dtos.TablePostDto;
import com.restaurant_system.restaurant_system.dtos.TableUpdateDto;

public interface ITableFloorController {
    void openTable(TablePostDto table);

    void closeTable(TableUpdateDto table);
}
