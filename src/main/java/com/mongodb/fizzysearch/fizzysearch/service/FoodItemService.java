package com.mongodb.fizzysearch.fizzysearch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.fizzysearch.fizzysearch.model.FoodItem;
import com.mongodb.fizzysearch.fizzysearch.repository.FoodItemRepository;

@Service
public class FoodItemService {

	@Autowired
	private FoodItemRepository foodItemRepository;
	
	
	

	public List<FoodItem> searchFoodItemsFuzzy(String query) {
        List<FoodItem> allFoodItems = foodItemRepository.findAll();
        List<FoodItem> results = new ArrayList<>();

        // Convert the query to lowercase for case-insensitive search
        String lowercaseQuery = query.toLowerCase();

        for (FoodItem foodItem : allFoodItems) {
            String lowercaseName = foodItem.getName().toLowerCase();

            // Implement the fuzzy search logic
            if (isFuzzyMatch(lowercaseName, lowercaseQuery)) {
                results.add(foodItem);
            }
        }

        return results;
    }

	public List<FoodItem> getAllFoodItems() {

		return foodItemRepository.findAll();
	}
	

    private boolean isFuzzyMatch(String name, String query) {
        int consecutiveMatches = 0;
        int queryIndex = 0;

        for (char c : name.toCharArray()) {
            if (queryIndex < query.length() && c == query.charAt(queryIndex)) {
                consecutiveMatches++;
                queryIndex++;

                if (consecutiveMatches >= 5) {
                    return true;
                }
            } else {
                consecutiveMatches = 0;
                queryIndex = 0;
            }
        }

        return false;
    }
}
