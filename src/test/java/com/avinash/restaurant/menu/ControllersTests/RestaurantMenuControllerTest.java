package com.avinash.restaurant.menu.ControllersTests;

import com.avinash.restaurant.menu.Controllers.RestaurantMenuController;
import com.avinash.restaurant.menu.Dao.RestaurantMenuDao;
import com.avinash.restaurant.menu.Entity.Item;
import com.avinash.restaurant.menu.Utils.MenuCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import  static org.mockito.Mockito.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class RestaurantMenuControllerTest {

    @InjectMocks
    private RestaurantMenuController restaurantMenuController;

    @Mock
    private RestaurantMenuDao restaurantMenuDao;

    private List<Item> items;
    @BeforeEach
    void setup(){

    }
    private List<Item> mockItemsList(){
        items = new ArrayList<>();
        //Item 1
        Item item = Item.builder()
                .itemId(1)
                .itemName("Pizza")
                .itemPrice(100)
                .itemCategory(MenuCategory.VEGETARIAN.name())
                .itemGroup("Main course")
                .build();
        Item item2 = Item.builder()
                .itemId(2)
                .itemName("Burger")
                .itemPrice(200)
                .itemCategory(MenuCategory.NON_VEGETARIAN.name())
                .itemGroup("Main course")
                .build();
        items.add(item);
        items.add(item2);
        return items;
    }

    @Test
    void testListItems(){
        doReturn(mockItemsList()).when(restaurantMenuDao).findAll();
        restaurantMenuController.listItems();
        Assertions.assertEquals(2,items.size());
    }



}
