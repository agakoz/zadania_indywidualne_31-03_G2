package A2.UML.AgK;

public class Plane extends Vehicle implements Flying {
    @Override
    public double getFuelNeeds() {
        return 9;
    }

    @Override
    public double getDistance() {
        return 23;
    }

    @Override
    public void takeOff() {
        System.out.println("plane took off");
    }

    @Override
    public void land() {
        System.out.println("plane landed");
    }

    @Override
    public void callAirControl() {
        System.out.println("houston we have a problem");
    }

    public void go() {
        System.out.println("plane started");
    }

    public void stop() {
        System.out.println("plane stopped");
    }

}
