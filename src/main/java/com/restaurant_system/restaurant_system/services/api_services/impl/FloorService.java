package com.restaurant_system.restaurant_system.services.api_services.impl;

import com.restaurant_system.restaurant_system.dtos.table.AddItemsToTableDto;
import com.restaurant_system.restaurant_system.model.*;
import com.restaurant_system.restaurant_system.services.api_services.IFloorService;
import com.restaurant_system.restaurant_system.services.internal_services.IItemService;
import com.restaurant_system.restaurant_system.services.internal_services.IOrderService;
import com.restaurant_system.restaurant_system.services.internal_services.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FloorService implements IFloorService {
    @Autowired
    private IOrderService orderService;
    @Autowired
    private ITableService tableService;
    @Autowired
    private IItemService itemService;
    @Override
    public void addItemsToTable(AddItemsToTableDto addItemsToTableDto) {
        List<ItemEntity> items = new ArrayList<>();
        TableEntity table = tableService.getTableByNum(addItemsToTableDto.getTable());
        for(String name : addItemsToTableDto.getItemNames()){
            items.add(itemService.getItemByName(name));
        }
        orderService.generateOrders(items, table);
    }

    @Override
    public void processPaiment(int num) {
        for(OrderEntity order : tableService.getTableByNum(num).getOrders()){
            orderService.updateOrderStatus(order.getId(),OrderStatus.PAID);
        }
        tableService.resetTable(num);
    }
    public void getTables(){
        tableService.getAllTables();
    }
}
