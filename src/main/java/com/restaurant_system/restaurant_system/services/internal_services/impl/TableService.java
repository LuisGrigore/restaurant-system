package com.restaurant_system.restaurant_system.services.internal_services.impl;

import com.restaurant_system.restaurant_system.dtos.table.TablePostDto;
import com.restaurant_system.restaurant_system.model.TableEntity;
import com.restaurant_system.restaurant_system.repos.ITableRepos;
import com.restaurant_system.restaurant_system.services.internal_services.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TableService implements ITableService {
    @Autowired
    private ITableRepos tableRepos;
    @Override
    public void createTable(TablePostDto table) {

    }
    @Override
    public TableEntity getTableByNum(int num) {
        return tableRepos.getByNum(num);
    }

    @Override
    public void resetTable(int num) {
        TableEntity table = getTableByNum(num);
        table.setDinerNum(0);
        table.setOrders(new ArrayList<>());
        tableRepos.save(table);
    }

    @Override
    public void getAllTables() {
        tableRepos.findAll();
    }
}
