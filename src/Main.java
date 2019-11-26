public class Main {
    public static void main(String[] args) {
        Salad salad = new Salad("Summer salad", new NightshadeFamily("TOMATO", 100),
                        new RootCrops("CARROT", 100), new PumpkinFamily("CUCUMBER", 50),
                        new NightshadeFamily("PEPPER", 250));
        salad.showIngredientsByCalories(26, 500);
        salad.showRecipe ();
        salad.sortIngredientsByClassificationVegetable ();
    }
}
