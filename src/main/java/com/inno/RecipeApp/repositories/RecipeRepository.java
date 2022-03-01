package com.inno.RecipeApp.repositories;

import com.inno.RecipeApp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
