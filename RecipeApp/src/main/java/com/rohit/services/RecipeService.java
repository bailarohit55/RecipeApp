package com.rohit.services;

import java.util.Set;

import com.rohit.domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();
	
	Recipe findById(Long l);
}
