package com.avinash.restaurant.menu.Controllers;

import com.avinash.restaurant.menu.Entity.Item;
import com.avinash.restaurant.menu.Mapper.ItemMapper;
import com.avinash.restaurant.menu.Modals.ItemModal;
import com.avinash.restaurant.menu.Services.RestaurantMenuService;
import com.avinash.restaurant.menu.WebAPIs.RestauantMenuApis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantMenuController implements RestauantMenuApis {
    @Autowired
    private RestaurantMenuService restaurantMenuService;
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public List<ItemModal> listItems() {
        return itemMapper.mapItemsToItemModals(restaurantMenuService.listItems());
    }
}
