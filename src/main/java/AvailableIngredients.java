import java.util.HashSet;
import java.util.Set;

public class AvailableIngredients {
    Set<Ingredient> ingredients = new HashSet<>();
    String name;
    Ingredient warningLow;
    Ingredient warningEmpty;
    AmountOfIngredient amount;


    public Set<Ingredient> setIngredientLow() {
        Set<Ingredient> ingredientLow = new HashSet<>();
        for (Ingredient ingredient : ingredientLow) {
            if ((AmountOfIngredient.GRAM.equals(ingredient.warningLow))) {
                ingredientLow.add(ingredient);
            } else if (AmountOfIngredient.SZTUKA.equals(ingredient.warningLow)) {
                ingredientLow.add(ingredient);
            } else if (AmountOfIngredient.MILILITR.equals(ingredient.warningLow)) {
                ingredientLow.add(ingredient);
            }
        }
        return ingredientLow;
    }
    public Set<Ingredient> setIngredientEmpty() {
        Set<Ingredient> ingredientEmpty = new HashSet<>();
        for (Ingredient ingredient : ingredientEmpty) {
            if ((AmountOfIngredient.GRAM.equals(ingredient.warningEmpty))) {
                ingredientEmpty.add(ingredient);
            } else if (AmountOfIngredient.SZTUKA.equals(ingredient.warningEmpty)) {
                ingredientEmpty.add(ingredient);
            } else if (AmountOfIngredient.MILILITR.equals(ingredient.warningEmpty)) {
                ingredientEmpty.add(ingredient);
            }
        }
        return ingredientEmpty;
    }
    public void addIngredient (){
        Ingredient ingredient = new Ingredient(name, amount, warningLow.warningLow, warningEmpty.warningEmpty);
        ingredients.add(ingredient);
    }

}
