public class GasPoweredCar extends Car {
    private double averageKmPerLtr;
    private int cylinders;
    public GasPoweredCar(String description, double averageKmPerLtr, int cylinders) {
        super(description);
        this.averageKmPerLtr = averageKmPerLtr;
        this.cylinders = cylinders;
    }


    @Override
    protected void runEngine() {
        System.out.println("Running gas powered engine with " + cylinders + " cylinders, averaging " + averageKmPerLtr + " km/ltr.");
    }
    @Override
    public void drive(){
        System.out.println("Driving gas powered car:");
        super.drive();
    }
    @Override
    public void startEngine() {
        System.out.println("Starting gas powered engine with " + cylinders + " cylinders.");
    }


}
