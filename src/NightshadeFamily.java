public class NightshadeFamily extends Vegetable {
    NightshadeFamily (String name, int weight) {
        super (name, weight);
    }

    @Override
    String cooking() {
        return "The nightshade family.";
    }
}
