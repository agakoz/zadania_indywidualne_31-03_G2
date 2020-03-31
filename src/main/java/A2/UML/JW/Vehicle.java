package A2.UML.JW;

public class Vehicle {

    private String name;


    public double getFuelNeeds() {
        return 4.0;
    }

    public double getDistance() {
        return 200.0;
    }

    public double calculateFuelConsumption(){
        return getDistance()*getFuelNeeds();
    }

    public void go(){
        System.out.println("Wystartował");
    }

    public void stop(){
        System.out.println("Wystopował");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
