public class Main {
    public static void main(String[] args) {

        Refrigerator fridge = new Refrigerator("LG Fridge");
        DishWasher washer = new DishWasher("Bosch Washer");
        CoffeeMaker coffeeMaker = new CoffeeMaker("Nespresso Machine");

        SmartKitchen s1 = new SmartKitchen("Modern Kitchen", coffeeMaker, washer, fridge);

        s1.setKitchenState();
        s1.getBrewMaster().brewCoffee();
        s1.getIceBox().orderFood();
        s1.getDishWasher().doDishes();



    }
}
