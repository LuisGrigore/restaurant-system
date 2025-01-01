package com.restaurant_system.restaurant_system.services.internal_services.impl;

import com.restaurant_system.restaurant_system.datasources.IItemDatasource;
import com.restaurant_system.restaurant_system.model.ItemEntity;
import com.restaurant_system.restaurant_system.services.internal_services.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService implements IItemService {
    @Autowired
    private IItemDatasource itemDatasource;
    @Override
    public Optional<ItemEntity> getItemByName(String name) {
        return itemDatasource.getItemByName(name);
    }
}
