package com.mongodb.fizzysearch.fizzysearch.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.fizzysearch.fizzysearch.model.FoodItem;

public interface FoodItemRepository 
		extends MongoRepository<FoodItem, String> {
	
}
