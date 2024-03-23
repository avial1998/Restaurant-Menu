package com.avinash.restaurant.menu.Services;

import com.avinash.restaurant.menu.Modals.ItemModal;
import com.avinash.restaurant.menu.Utils.MenuCategory;
import org.springframework.stereotype.Service;

@Service
public class RestaurantMenuService {
    public ItemModal listItems(){
        System.out.println("Listing items");
        ItemModal itemModal = new ItemModal();
        itemModal.setItemName("Margarite Pizza");
        itemModal.setItemPrice(100);
        itemModal.setItemCategory(MenuCategory.VEGETARIAN.name());
        itemModal.setItemDescription("Margarite Pizza is a cheese based pizza");
        itemModal.setItemGroup("Pizza");
        return itemModal;
    }
}
