package com.inno.RecipeApp.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
