package A2.UML.JW;

public class Truck extends Car {
    @Override
    public double getFuelNeeds() {
        return super.getFuelNeeds()*5;
    }
}
