package A2.UML.JW;

public class RaceCar extends Car {
    @Override
    public double getFuelNeeds() {
        return super.getFuelNeeds()*2;
    }
}
