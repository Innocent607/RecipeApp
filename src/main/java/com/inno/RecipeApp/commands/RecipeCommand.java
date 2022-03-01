package com.inno.RecipeApp.commands;

import com.inno.RecipeApp.commands.CategoryCommand;
import com.inno.RecipeApp.commands.IngredientCommand;
import com.inno.RecipeApp.commands.NotesCommand;
import com.inno.RecipeApp.model.Difficulty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

@Setter
@Getter
@NoArgsConstructor
public class RecipeCommand {

    private Long id;
    private  String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Difficulty difficulty;
    private NotesCommand notes;
    private Byte[] image;

    private Set<IngredientCommand> ingredients = new HashSet<>();
    private Set<CategoryCommand> categories = new HashSet<>();

}
