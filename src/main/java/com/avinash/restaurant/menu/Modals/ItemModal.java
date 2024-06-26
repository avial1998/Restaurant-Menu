package com.avinash.restaurant.menu.Modals;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ItemModal {
    private String id;
    private String itemName;
    private int itemPrice;
    private String itemCategory;
    private String itemDescription;
    private String itemGroup;
}
