package com.rohit.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rohit.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
