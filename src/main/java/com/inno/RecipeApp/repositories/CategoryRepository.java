package com.inno.RecipeApp.repositories;

import com.inno.RecipeApp.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}