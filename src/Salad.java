import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class TypeVegetableComparator implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable vegetableOne, Vegetable vegetableTwo) {
        if (vegetableOne.getClass() == vegetableTwo.getClass()) {
            return 0;
        } else if (vegetableOne.getClass().hashCode() > vegetableTwo.getClass().hashCode()) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class Salad {
    private String name;
    private ArrayList<Vegetable> vegetableArrayList = new ArrayList<Vegetable> ();

    Salad (String name, Vegetable... ingredients) {
        this.name = name;
        for (Vegetable vegetable : ingredients) {
            this.vegetableArrayList.add (vegetable);
        }
    }

    public String getName () {
        return name;
    }

    public Salad setName(String name) {
        this.name = name;
        return this;
    }

    public Salad setComponent(Vegetable v) {
        this.vegetableArrayList.add(v);
        return this;
    }

    public void showRecipe () {
        if (vegetableArrayList.isEmpty()) {
            System.out.println("You haven't added any ingredients yet!");
            return;
        }

        System.out.println("The salad " + name + " contains:");
        for (Vegetable vegetable : vegetableArrayList) {
            System.out.println(vegetable.getName());
        }
        System.out.println(displayCalorieFood());
    }

    public void sortIngredientsByClassificationVegetable () {
        System.out.println("Sort ingredients :");
        Collections.sort(vegetableArrayList, new TypeVegetableComparator());

        for (Vegetable vegetable : vegetableArrayList)
            System.out.print(" " + vegetable.getName());
    }


    public int displayCalorieFood (){
        int calorieSalad = 0;

        for (Vegetable vegetable : vegetableArrayList ){
            calorieSalad += Math.round(vegetable.getWeight() * vegetable.getCalorie100g()/100);
        }
        System.out.print("Salad has kcal: ");
        return calorieSalad;
    }



   public void showIngredientsByCalories(int lowerRangeCalorie, int upperRangeCalorie){
        int calorie;
        System.out.println("Range calorie: " + lowerRangeCalorie + ", " + upperRangeCalorie);

        for (Vegetable vegetable : vegetableArrayList){
            calorie = Math.round(vegetable.getWeight() * vegetable.getCalorie100g()/100);

            if ((calorie >= lowerRangeCalorie)&& (calorie <= upperRangeCalorie))
                System.out.println("Vegetable corresponding to a given calorie range: " + vegetable.getName()
                                    + " - " + vegetable.getCalorie100g() + "kcal.");
        }
   }


}
