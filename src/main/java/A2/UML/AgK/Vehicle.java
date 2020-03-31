package A2.UML.AgK;

public class Vehicle {
    private String name;

    public String toString(){
        return "Vehicle";
    }
    public double getFuelNeeds(){
        return 0;
    }
    public double getDistance(){
        return 0;
    }
    public double calculateFuelConsumption(){
        return getFuelNeeds()*getDistance();
    }
    public void go(){
        System.out.println("on the way");
    }
    public void stop(){
        System.out.println("stopped");
    }

}
