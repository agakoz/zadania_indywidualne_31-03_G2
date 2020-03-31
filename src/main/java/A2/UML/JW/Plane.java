package A2.UML.JW;

public class Plane extends Vehicle implements Flying{
    @Override
    public double getFuelNeeds() {
        return 900.5;
    }

    @Override
    public double getDistance() {
        return 12356.0;
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void stop() {
        super.stop();
    }


    @Override
    public void takeOff() {
        System.out.println("Startowanko");
    }

    @Override
    public void land() {
        System.out.println("Lądowanko");
    }

    @Override
    public void callAirControl() {
        System.out.println("Huston, mamy problem");
    }
}
