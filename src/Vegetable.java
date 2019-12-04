enum VegetableList {
    CARROT, TOMATO, CUCUMBER, PEPPER
}

public abstract class Vegetable {
    private String name;
    private int calorie100g;
    private int weight;
    private VegetableList vegetableList;

    Vegetable(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    abstract String cooking();

    public String getName() {
        return name;
    }

    public int getCalorie100g() {
        switch (vegetableList.valueOf(name)) {
            case CARROT:
                calorie100g = 25;
                break;
            case BOW:
                calorie100g = 29;
                break;
            case CABBAGE:
                calorie100g = 31;
                break;
            case TOMATO:
                calorie100g = 35;
                break;
            case CUCUMBER:
                calorie100g = 27;
                break;
            case PEPPER:
                calorie100g = 32;
                break;
            case PARSLEY:
                calorie100g = 12;
                break;
            default:
                calorie100g = 0;
                break;
        }
        return calorie100g;
    }

    public int getWeight() {
        return weight;
    }
}
