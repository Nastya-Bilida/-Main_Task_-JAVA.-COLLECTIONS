public class RootCrops extends Vegetable {
    RootCrops(String name, int weight){
        super (name,weight);
    }

    @Override
    String cooking () {
        return "Root crops.";
    }
}
