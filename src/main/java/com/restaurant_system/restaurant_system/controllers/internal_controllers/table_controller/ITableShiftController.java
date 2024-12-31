package com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller;

import com.restaurant_system.restaurant_system.dtos.table.TableLayoutDto;

public interface ITableShiftController {
    void initTableLayout(TableLayoutDto tableLayout);
}
