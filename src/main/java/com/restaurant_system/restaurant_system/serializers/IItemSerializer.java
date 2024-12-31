package com.restaurant_system.restaurant_system.serializers;

import com.restaurant_system.restaurant_system.model.ItemEntity;

public interface IItemSerializer {
    ItemEntity deserializeItem();
}
