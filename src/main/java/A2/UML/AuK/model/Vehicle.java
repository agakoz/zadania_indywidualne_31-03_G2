package A2.UML.AuK.model;

import lombok.Data;

@Data
public class Vehicle {
    private String name;

    double getFuelNeeds(){
        return 913;
    }


    double getDistance(){
        return 783;
    }
    double calculateFuelConsumption(){
        return 4534;
    }

    void go(){
        System.out.println("go");
    }
    void stop(){
        System.out.println("stop");
    }

}
