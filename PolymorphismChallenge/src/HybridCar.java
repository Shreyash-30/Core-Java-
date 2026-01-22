public class HybridCar extends Car {
    private int avgKmPerLtr;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, int avgKmPerLtr, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLtr = avgKmPerLtr;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }


  @Override
    protected void runEngine() {
        System.out.println("Running hybrid engine with " + cylinders + " cylinders and battery size of " + batterySize + " kWh, averaging " + avgKmPerLtr + " km/ltr.");
    }
    @Override
    public void drive(){
        System.out.println("Driving hybrid car:");
        super.drive();

    }
    @Override
    public void startEngine() {
        System.out.println("Starting hybrid engine with " + cylinders + " cylinders and battery size of " + batterySize + " kWh.");
    }

}
