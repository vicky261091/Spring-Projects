package vickytechie.spring.recipe.services;

import org.springframework.stereotype.Service;
import vickytechie.spring.recipe.domain.Recipe;

import java.util.Set;


public interface RecipeService {
public Set<Recipe> getRecipe();
}
