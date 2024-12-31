package com.restaurant_system.restaurant_system.services.impl;

import com.restaurant_system.restaurant_system.repos.ITableRepos;
import com.restaurant_system.restaurant_system.services.ITableService;
import org.springframework.beans.factory.annotation.Autowired;

public class TableService implements ITableService {
    @Autowired
    private ITableRepos tableRepos;
    @Override
    public void createTable() {

    }

    @Override
    public void updateTale() {

    }
}
