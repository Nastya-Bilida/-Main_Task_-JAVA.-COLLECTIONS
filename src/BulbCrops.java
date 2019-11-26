public class BulbCrops extends Vegetable {
    BulbCrops (String name, int weight) {
        super (name, weight);
    }

    @Override
    String cooking() {
        return "Bulb crops.";
    }
}
