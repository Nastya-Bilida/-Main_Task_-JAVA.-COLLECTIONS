public class RootCrops extends Vegetable {
    RootCrops(String name, int weight){

        super(name,weight);
    }

    @Override
    public String getName() {

        return super.getName();
    }

    @Override
    String cooking() {
        return "Root crops.";
    }
}
