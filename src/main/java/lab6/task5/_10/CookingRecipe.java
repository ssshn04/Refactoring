package lab6.task5._10;
abstract class CookingRecipe {
    public void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void addIngredients();

    protected abstract void cook();

    private void serve() {
        System.out.println("Serving");
    }
}

