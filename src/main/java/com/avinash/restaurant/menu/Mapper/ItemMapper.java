package com.avinash.restaurant.menu.Mapper;

import com.avinash.restaurant.menu.Entity.Item;
import com.avinash.restaurant.menu.Modals.ItemModal;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemMapper {
    @Autowired
    private  final ModelMapper modelMapper;

    public ItemMapper() {
        this.modelMapper = new ModelMapper();
    }

    public ItemModal mapItemToItemModal(Item item){
        return modelMapper.map(item,ItemModal.class);
    }
    public List<ItemModal> mapItemsToItemModals(List<Item> items){
        return items.stream().map(this::mapItemToItemModal).toList();
    }

    public Item mapItemModalToItem(ItemModal itemModal){
        return modelMapper.map(itemModal, Item.class);
    }

    public List<Item> mapItemModalsToItems(List<ItemModal> itemModals){
        return itemModals.stream().map(this::mapItemModalToItem).toList();
    }

}
