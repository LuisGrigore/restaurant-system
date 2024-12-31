package com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller.impl;

import com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller.ITableFloorController;
import com.restaurant_system.restaurant_system.controllers.internal_controllers.table_controller.ITableShiftController;
import com.restaurant_system.restaurant_system.dtos.TableLayoutDto;
import com.restaurant_system.restaurant_system.dtos.TablePostDto;
import com.restaurant_system.restaurant_system.dtos.TableUpdateDto;
import com.restaurant_system.restaurant_system.services.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
public class TableController implements ITableFloorController, ITableShiftController {
    @Autowired
    private ITableService tableService;
    @Override
    public void openTable(TablePostDto table) {
        tableService.createTable(table);
    }

    @Override
    public void closeTable(TableUpdateDto table) {
        table.setDinerNum(0);
        table.setOrders(new ArrayList<>());
        tableService.updateTable(table);
    }

    @Override
    public void initTableLayout(TableLayoutDto tableLayout) {
        for(TablePostDto table : tableLayout.getTables()){
            tableService.createTable(table);
        }
    }
}
