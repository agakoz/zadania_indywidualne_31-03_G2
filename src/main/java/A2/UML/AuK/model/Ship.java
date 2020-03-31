package A2.UML.AuK.model;

import A2.UML.AuK.interfaces.Sailing;

public class Ship extends Vehicle implements Sailing {


    @Override
    public double getFuelNeeds() {
        return 324;
    }

    @Override
    public double getDistance() {
        return 2422;
    }

    @Override
    public void dock() {
        System.out.println("dock");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
