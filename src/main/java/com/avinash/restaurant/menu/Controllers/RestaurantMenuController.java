package com.avinash.restaurant.menu.Controllers;

import com.avinash.restaurant.menu.Modals.ItemModal;
import com.avinash.restaurant.menu.Services.RestaurantMenuService;
import com.avinash.restaurant.menu.WebAPIs.RestauantMenuApis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantMenuController implements RestauantMenuApis {
    @Autowired
    private RestaurantMenuService restaurantMenuService;
    @Override
    public ItemModal listItems() {
        return restaurantMenuService.listItems();
    }
}
