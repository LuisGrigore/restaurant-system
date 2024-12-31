package com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller;

import com.restaurant_system.restaurant_system.model.TableEntity;

public interface ITableOrderController {
    TableEntity getTableByNum(int num);
}
