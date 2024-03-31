package com.avinash.restaurant.menu.WebAPIs;

import com.avinash.restaurant.menu.Entity.Item;
import com.avinash.restaurant.menu.Modals.ItemModal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@RequestMapping(path = "/restuarant/v1/menu")
public interface RestauantMenuApis {
    @RequestMapping(method = RequestMethod.GET,path ="/listItems")
    public List<ItemModal> listItems();
}
