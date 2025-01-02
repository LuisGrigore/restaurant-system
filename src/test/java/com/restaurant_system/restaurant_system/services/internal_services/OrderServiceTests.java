package com.restaurant_system.restaurant_system.services.internal_services;

import com.restaurant_system.restaurant_system.model.ItemEntity;
import com.restaurant_system.restaurant_system.model.OrderEntity;
import com.restaurant_system.restaurant_system.model.TableEntity;
import com.restaurant_system.restaurant_system.model.Type;
import com.restaurant_system.restaurant_system.order_asignator.IOrderAsignator;
import com.restaurant_system.restaurant_system.repos.IOrderRepos;
import com.restaurant_system.restaurant_system.services.internal_services.impl.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTests {
    @Mock
    private IOrderRepos orderRepos;
    @Mock
    private IOrderAsignator orderAsignator;
    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Inicializa los mocks
    }

    @Test
    public void testGenerateOrders_NoNullItems() {
        final String nameA = "nameA";
        final String nameB = "nameB";
        final String nameC = "nameC";
        final int tableNum = 1;
        final Type typeA = Type.BAR;
        final Type typeB = Type.KITCHEN;
        final Type typeC = Type.BAR;
        final ItemEntity itemA = ItemEntity.builder().name(nameA).type(typeA).build();
        final ItemEntity itemB = ItemEntity.builder().name(nameB).type(typeB).build();
        final ItemEntity itemC = ItemEntity.builder().name(nameC).type(typeC).build();
        final List<ItemEntity> items = new ArrayList<>();
        items.add(itemA);
        items.add(itemB);
        items.add(itemC);
        final TableEntity table = new TableEntity();
        table.setNum(tableNum);

        orderService.generateOrders(items,table);

        ArgumentCaptor<OrderEntity> captor = ArgumentCaptor.forClass(OrderEntity.class);

        verify(orderAsignator, times(2)).asignOrder(captor.capture());

        List<OrderEntity> capturedValues = captor.getAllValues();

        assertEquals(2, capturedValues.size());

        assertEquals(1, capturedValues.get(0).getTable().getNum());
        assertEquals(1, capturedValues.get(1).getTable().getNum());


        assertEquals(typeA, capturedValues.get(0).getType());
        assertEquals(typeB, capturedValues.get(1).getType());

        assertEquals(List.of(itemA,itemC), capturedValues.get(0).getItems());
        assertEquals(List.of(itemB), capturedValues.get(1).getItems());
    }
}
