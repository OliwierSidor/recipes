import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ingredient {
    String name;
    AmountOfIngredient amount;
    double warningLow;
    double warningEmpty;
}
