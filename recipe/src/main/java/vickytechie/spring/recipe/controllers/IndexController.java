package vickytechie.spring.recipe.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vickytechie.spring.recipe.services.RecipeService;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model mv) {
        log.debug("In getIndexPage method of IndexController class");
        mv.addAttribute("recipes", recipeService.getRecipe());

        return "index";
    }
}