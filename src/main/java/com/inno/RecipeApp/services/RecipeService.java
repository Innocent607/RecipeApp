package com.inno.RecipeApp.services;

import com.inno.RecipeApp.commands.RecipeCommand;
import com.inno.RecipeApp.model.Recipe;

import java.util.Set;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findByID(Long l);

    RecipeCommand findCommandById( Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
