public class Main {
    public static void main(String[] args) {
        Car gasCar = new GasPoweredCar("Toyota Camry", 15.0, 4);
        gasCar.startEngine();
        gasCar.drive();

        Car hybridCar = new HybridCar("Honda Accord Hybrid", 20, 2, 4);
        hybridCar.startEngine();
        hybridCar.drive();

        Car electricCar = new ElectricCar("Tesla Model 3", 75, 4);
        electricCar.startEngine();
        electricCar.drive();

    }
}
