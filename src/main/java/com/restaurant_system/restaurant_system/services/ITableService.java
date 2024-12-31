package com.restaurant_system.restaurant_system.services;

import com.restaurant_system.restaurant_system.dtos.TablePostDto;
import com.restaurant_system.restaurant_system.dtos.TableUpdateDto;

public interface ITableService {
    void createTable(TablePostDto table);
    void updateTable(TableUpdateDto table);
}
