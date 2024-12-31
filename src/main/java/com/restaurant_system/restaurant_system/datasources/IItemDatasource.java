package com.restaurant_system.restaurant_system.datasources;

import com.restaurant_system.restaurant_system.model.ItemEntity;

public interface IItemDatasource {
    ItemEntity getItemByName(String name);
}