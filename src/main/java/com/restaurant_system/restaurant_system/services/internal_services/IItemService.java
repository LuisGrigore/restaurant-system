package com.restaurant_system.restaurant_system.services.internal_services;

import com.restaurant_system.restaurant_system.model.ItemEntity;

public interface IItemService {
    ItemEntity getItemByName(String name);
}
