package com.restaurant_system.restaurant_system.serializers.impl;

import com.restaurant_system.restaurant_system.model.ItemEntity;
import com.restaurant_system.restaurant_system.serializers.IItemSerializer;
import org.springframework.stereotype.Component;

@Component
public class ItemSerializer implements IItemSerializer {
    @Override
    public ItemEntity deserializeItem() {
        return null;
    }
}
