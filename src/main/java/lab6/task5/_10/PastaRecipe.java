package lab6.task5._10;

public class PastaRecipe extends CookingRecipe {
    @Override
    protected void addIngredients() {
        System.out.println("Adding pasta");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking pasta");
    }
}
