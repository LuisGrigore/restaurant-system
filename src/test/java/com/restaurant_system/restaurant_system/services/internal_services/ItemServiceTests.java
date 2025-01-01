package com.restaurant_system.restaurant_system.services.internal_services;

import com.restaurant_system.restaurant_system.datasources.IItemDatasource;
import com.restaurant_system.restaurant_system.model.ItemEntity;
import com.restaurant_system.restaurant_system.model.Type;
import com.restaurant_system.restaurant_system.services.internal_services.impl.ItemService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTests {
    @Mock
    private IItemDatasource itemDatasource;
    @InjectMocks
    private ItemService itemService;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Inicializa los mocks
    }
    @Test
    public void testGetItemByName_ItemExists(){
        String name = "name";
        ItemEntity item = new ItemEntity(1,name,1, Type.KITCHEN);
        Optional<ItemEntity> itemOpt = Optional.of(item);
        when(itemDatasource.getItemByName(name)).thenReturn(itemOpt);
        Optional<ItemEntity> foundItem = itemService.getItemByName(name);
        assertTrue(foundItem.isPresent());
        assertEquals(item, foundItem.get());
    }
    @Test
    public void testGetItemByName_ItemNotExists(){
        String name = "name";
        Optional<ItemEntity> itemOpt = Optional.empty();
        when(itemDatasource.getItemByName(name)).thenReturn(itemOpt);
        Optional<ItemEntity> foundItem = itemService.getItemByName(name);
        assertTrue(foundItem.isEmpty());
    }
}
