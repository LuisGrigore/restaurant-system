package com.restaurant_system.restaurant_system.services.internal_services;

import com.restaurant_system.restaurant_system.dtos.table.TablePostDto;
import com.restaurant_system.restaurant_system.dtos.table.TableUpdateDto;
import com.restaurant_system.restaurant_system.model.TableEntity;

public interface ITableService {
    void createTable(TablePostDto table);
    TableEntity getTableByNum(int num);

    void resetTable(int num);

    void getAllTables();
    void senTableUpdate();
}
