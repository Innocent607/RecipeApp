package com.inno.RecipeApp.services;

import com.inno.RecipeApp.model.Recipe;
import com.inno.RecipeApp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by Onalethata I. L. Maswabi
 * AKA Inno607
 */

@Slf4j
@Service
public class ImageServiceImpl implements ImageService {

    private final RecipeRepository recipeRepository;

    public ImageServiceImpl( RecipeRepository recipeService) {
        this.recipeRepository = recipeService;
    }

    @Override
    @Transactional
    public void saveImageFile(Long recipeId, MultipartFile file) {
        try {
            Recipe recipe = recipeRepository.findById(recipeId).get();

            Byte[] byteObjects = new Byte[file.getBytes().length];

            int i = 0;
            for (byte b : file.getBytes()) {
                byteObjects[i++] = b;
            }

            recipe.setImage(byteObjects);
            recipeRepository.save(recipe);

        } catch (IOException e) {
            //todo handle better
            log.error("Error occured", e);
            e.printStackTrace();
        }
    }
}
