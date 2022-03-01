package com.inno.RecipeApp.services;

import com.inno.RecipeApp.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
