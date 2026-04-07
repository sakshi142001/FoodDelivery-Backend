package com.fooddelivery.restaurant_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fooddelivery.restaurant_service.entity.MenuItem;
import com.fooddelivery.restaurant_service.entity.Restaurant;
import com.fooddelivery.restaurant_service.service.RestaurantService;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
     @Autowired
    private RestaurantService service;

    // 🔹 Add Restaurant
    @PostMapping
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return service.addRestaurant(restaurant);
    }

    // 🔹 Get All Restaurants
    @GetMapping
    public List<Restaurant> getAll() {
        return service.getAllRestaurants();
    }
    
    // 🔹 Add Menu Item
    @PostMapping("/menu")
    public MenuItem addMenu(@RequestBody MenuItem item) {
        return service.addMenuItem(null);
    }

    // 🔹 Get Menu by Restaurant
    @GetMapping("/{restaurantId}/menu")
    public List<MenuItem> getMenu(@PathVariable Long restaurantId) {
        return service.getMenuByRestaurant(restaurantId);
    }
}
