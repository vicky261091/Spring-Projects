package vickytechie.spring.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vickytechie.spring.recipe.domain.Category;
import vickytechie.spring.recipe.domain.Recipe;

import java.util.Optional;
@Repository
public interface RecipeRepository extends CrudRepository<Recipe,Long> {


}
