package vickytechie.spring.recipe.services;

import org.springframework.stereotype.Service;
import vickytechie.spring.recipe.domain.Recipe;
import vickytechie.spring.recipe.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements  RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Set<Recipe> getRecipe(){

        Set<Recipe> recipes=new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
         return recipes;

    }
}
