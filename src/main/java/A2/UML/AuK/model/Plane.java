package A2.UML.AuK.model;

import A2.UML.AuK.interfaces.Flaying;

public class Plane extends Vehicle implements Flaying {

    @Override
    public double getFuelNeeds() {
        return 2000;
    }

    @Override
    public double getDistance() {
        return 1000;
    }

    @Override
    public void takeOff() {
        System.out.println("Plane takes off");
    }

    @Override
    public void land() {
        System.out.println("Plane landing");
    }

    @Override
    public void callAirControl() {
        System.out.println("Call air control....");
    }

    @Override
    public void go() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
