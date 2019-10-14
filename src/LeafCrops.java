public class LeafCrops extends Vegetable {
    LeafCrops(String name, int weight){
        super(name,weight);
    }

    @Override
    String cooking() {
        return "Leaf crops.";
    }
}
