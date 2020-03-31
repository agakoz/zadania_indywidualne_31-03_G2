package A2.UML.JW;

public class Ship extends Vehicle implements Sailing {
    @Override
    public double getFuelNeeds() {
        return 78.98;
    }

    @Override
    public double getDistance() {
        return 49879.87;
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void dock() {
        System.out.println("Statek robi to co robią statki, chyba w porcie? Nie znam się na statkach");
    }
}
