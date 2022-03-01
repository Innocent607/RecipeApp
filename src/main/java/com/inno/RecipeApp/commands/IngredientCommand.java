package com.inno.RecipeApp.commands;

import com.inno.RecipeApp.commands.UnitOfMeasureCommand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

@Setter
@Getter
@NoArgsConstructor
public class IngredientCommand {

    private Long id;
    private  Long recipeId;
    private  String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand uom;
}
