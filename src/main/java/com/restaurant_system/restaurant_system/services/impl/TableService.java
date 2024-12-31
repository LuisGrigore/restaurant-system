package com.restaurant_system.restaurant_system.services.impl;

import com.restaurant_system.restaurant_system.dtos.TablePostDto;
import com.restaurant_system.restaurant_system.dtos.TableUpdateDto;
import com.restaurant_system.restaurant_system.model.TableEntity;
import com.restaurant_system.restaurant_system.repos.ITableRepos;
import com.restaurant_system.restaurant_system.services.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService implements ITableService {
    @Autowired
    private ITableRepos tableRepos;
    @Override
    public void createTable(TablePostDto table) {

    }

    @Override
    public void updateTable(TableUpdateDto table) {

    }

    @Override
    public TableEntity getTableByNum(int num) {
        return tableRepos.getByNum(num);
    }
}
