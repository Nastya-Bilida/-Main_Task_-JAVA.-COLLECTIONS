public class PumpkinFamily extends Vegetable {
    PumpkinFamily (String name, int weight){
        super (name,weight);
    }

    @Override
    String cooking() {
        return "Pumpkin family.";
    }
}
