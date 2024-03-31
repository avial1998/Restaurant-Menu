package com.avinash.restaurant.menu.Dao;

import com.avinash.restaurant.menu.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantMenuDao extends JpaRepository<Item,Integer> {

}
