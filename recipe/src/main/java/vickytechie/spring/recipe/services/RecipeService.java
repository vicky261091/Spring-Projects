package vickytechie.spring.recipe.services;

import vickytechie.spring.recipe.domain.Recipe;

import java.util.Set;


public interface RecipeService {
    public Set<Recipe> getRecipe();
    public Recipe findById(Long l);
}
