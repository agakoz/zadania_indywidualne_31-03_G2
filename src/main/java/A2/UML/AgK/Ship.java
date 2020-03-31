package A2.UML.AgK;

public class Ship extends Vehicle implements Sailing {
    @Override
    public double getFuelNeeds() {
        return 5;
    }

    @Override
    public double getDistance() {
        return 4;
    }

    @Override
    public void dock() {
        System.out.println("Ship docked");
    }

    @Override
    public void stop() {
        System.out.println("ship stopped");
    }
}
