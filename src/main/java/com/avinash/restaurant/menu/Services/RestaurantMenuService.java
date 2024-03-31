package com.avinash.restaurant.menu.Services;

import com.avinash.restaurant.menu.Dao.RestaurantMenuDao;
import com.avinash.restaurant.menu.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantMenuService {
    @Autowired
    private RestaurantMenuDao restaurantMenuDao;
    public List<Item> listItems(){

        return restaurantMenuDao.findAll();
    }
}
