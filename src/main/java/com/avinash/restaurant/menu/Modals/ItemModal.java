package com.avinash.restaurant.menu.Modals;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@Component
public class ItemModal {
    private String itemName;
    private int itemPrice;
    private String itemCategory;
    private String itemDescription;
    private String itemGroup;
}
