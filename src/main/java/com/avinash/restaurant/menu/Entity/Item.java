package com.avinash.restaurant.menu.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;
    private String itemName;
    private int itemPrice;
    private String itemCategory;
    private String itemDescription;
    private String itemGroup;


}
