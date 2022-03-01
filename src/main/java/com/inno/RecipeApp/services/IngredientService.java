package com.inno.RecipeApp.services;

import com.inno.RecipeApp.commands.IngredientCommand;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

public interface IngredientService {

    IngredientCommand findByRecipeAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
