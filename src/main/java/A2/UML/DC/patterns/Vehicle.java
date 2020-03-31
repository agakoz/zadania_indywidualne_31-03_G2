package A2.UML.DC.patterns;

import lombok.ToString;

@ToString
public class Vehicle {
    private String name;

    public double getFuelNeeds() {
        return -1;
    }

    public double getDistance() {
        return -1;
    }

    public double calculateFuelConsumption() {
        return -1;
    }

    public void go() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

}
