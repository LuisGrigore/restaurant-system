package com.restaurant_system.restaurant_system.services.impl;

import com.restaurant_system.restaurant_system.datasources.IItemDatasource;
import com.restaurant_system.restaurant_system.model.ItemEntity;
import com.restaurant_system.restaurant_system.services.IItemService;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemService implements IItemService {
    @Autowired
    private IItemDatasource itemDatasource;
    @Override
    public ItemEntity getItemByName(String name) {
        return itemDatasource.getItemByName(name);
    }
}
