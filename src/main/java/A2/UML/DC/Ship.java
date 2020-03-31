package A2.UML.DC;

import A2.UML.DC.patterns.Sailing;
import A2.UML.DC.patterns.Vehicle;

public class Ship extends Vehicle implements Sailing {
    @Override
    public void dock() {
        System.out.println("Ship docked");
    }

    @Override
    public double getFuelNeeds() {
        return super.getFuelNeeds();
    }

    @Override
    public double getDistance() {
        return super.getDistance();
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Ship stopped");
    }

}
