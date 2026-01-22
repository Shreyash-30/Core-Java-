public class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        System.out.println("Running electric engine with battery size of " + batterySize + " kWh, averaging " + avgKmPerCharge + " km/charge.");
    }
    @Override
    public void drive(){
        System.out.println("Driving electric car:");
        super.drive();
    }
    @Override
    public void startEngine() {
        System.out.println("Starting electric engine with battery size of " + batterySize + " kWh.");
    }

}
