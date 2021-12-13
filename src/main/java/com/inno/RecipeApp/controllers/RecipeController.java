package com.inno.RecipeApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    public RecipeController() {
    }

    @GetMapping({"", "/"})
    public String getRecipe () {

        return "index";
    }
}
