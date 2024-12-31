package com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller.impl;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.order_controller.IOrderTableController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller.ITableFloorController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller.ITableOrderController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller.ITableShiftController;
import com.restaurant_system.restaurant_system.dtos.table.TableLayoutDto;
import com.restaurant_system.restaurant_system.dtos.table.TablePostDto;
import com.restaurant_system.restaurant_system.model.TableEntity;
import com.restaurant_system.restaurant_system.services.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TableController implements ITableFloorController, ITableShiftController, ITableOrderController {
    @Autowired
    private ITableService tableService;
    @Autowired
    private IOrderTableController orderController;
    @Override
    public void openTable(TablePostDto table) {
        tableService.createTable(table);
    }

    @Override
    public void closeTable(int num) {
        orderController.setOrdersToPaid(tableService.getTableByNum(num).getOrders());
        tableService.resetTable(num);
    }

    @Override
    public void initTableLayout(TableLayoutDto tableLayout) {
        for(TablePostDto table : tableLayout.getTables()){
            tableService.createTable(table);
        }
    }

    @Override
    public TableEntity getTableByNum(int num) {
        return tableService.getTableByNum(num);
    }
}
