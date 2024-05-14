package lab6.task5._10;

public class Main {
    public static void main(String[] args) {
        CookingRecipe pastaRecipe = new PastaRecipe();
        pastaRecipe.prepareRecipe();
        System.out.println();

        CookingRecipe cakeRecipe = new CakeRecipe();
        cakeRecipe.prepareRecipe();
    }
}
