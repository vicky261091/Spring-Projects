package vickytechie.spring.recipe.domain;

import lombok.*;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"category"})
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String source;
    private String uri;
    @Lob
    private String directions;

    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;

    @Enumerated(value=EnumType.STRING)
    private Difficulty difficulty;

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "recipe")
    private Set<Ingredients> ingredients=new HashSet<>();

    @ManyToMany
    @JoinTable(name="recipe_category",joinColumns = @JoinColumn(name="recipe_Id"),inverseJoinColumns = @JoinColumn(name="category_Id"))
    private Set<Category> category=new HashSet<>();

}
