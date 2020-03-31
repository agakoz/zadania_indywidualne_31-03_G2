package A2.UML.DC;

import A2.UML.DC.patterns.Flying;
import A2.UML.DC.patterns.Vehicle;

public class Plane extends Vehicle implements Flying {
    @Override
    public double getFuelNeeds() {
        return super.getFuelNeeds();
    }

    @Override
    public double getDistance() {
        return super.getDistance();
    }

    @Override
    public void go() {
        super.go();
        System.out.println("Plane started");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Plane stopped");
    }

    @Override
    public void takeOff() {
        System.out.println("Plane taken off");
    }

    @Override
    public void land() {
        System.out.println("Plane landed");
    }

    @Override
    public void callAirControl() {
        System.out.println("Plane called air control");
    }

}
