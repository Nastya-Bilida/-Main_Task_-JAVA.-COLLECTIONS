public class Main {

    public static void main(String[] args) {
        Salad salad = new Salad("Lala", new RootCrops("TOMATO", 100), new RootCrops("CARROT", 100),
                new NightshadeFamily("CUCUMBER", 50), new NightshadeFamily("PEPPER", 250));
        salad.showIngredientsByCalories(26, 500);
        salad.showRecipe();
        salad.sortIngredientsByClassificationVegetable();
    }
}
