package com.restaurant_system.restaurant_system.services;

import com.restaurant_system.restaurant_system.dtos.table.TablePostDto;
import com.restaurant_system.restaurant_system.dtos.table.TableUpdateDto;
import com.restaurant_system.restaurant_system.model.TableEntity;

public interface ITableService {
    void createTable(TablePostDto table);
    void updateTable(TableUpdateDto table);
    TableEntity getTableByNum(int num);
}
