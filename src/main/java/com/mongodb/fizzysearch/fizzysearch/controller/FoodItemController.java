package com.mongodb.fizzysearch.fizzysearch.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.fizzysearch.fizzysearch.model.FoodItem;
import com.mongodb.fizzysearch.fizzysearch.service.FoodItemService;

@RestController
public class FoodItemController {

    @Autowired
    private FoodItemService foodItemService;

    @GetMapping("/search")
    public ResponseEntity<List<FoodItem>> searchFoodItems(
            @RequestParam(required = false) String query
    ) {
        if (query == null || query.trim().isEmpty()) {
            // Handle the case where query is missing or empty
            return ResponseEntity.badRequest().build();
        }

        List<FoodItem> results = foodItemService.searchFoodItemsFuzzy(query);
        return ResponseEntity.ok(results);
    }
    
    @GetMapping("/foodItems")
    public ResponseEntity<List<FoodItem>> getAllFoodItems() {
        List<FoodItem> foodItems = foodItemService.getAllFoodItems();
        return ResponseEntity.ok(foodItems);
    }
}

