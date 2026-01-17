public class SmartKitchen extends Kitchen {
    CoffeeMaker brewMaster;
    DishWasher dishWasher;
    Refrigerator iceBox;

    public SmartKitchen(String type, CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        super(type);
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void addWater(){
        brewMaster.hasWorkToDo = true;
    }
    public void pourMilk(){
        iceBox.hasWorkToDo = true;
    }
    public void loadDishwasher(){
        dishWasher.hasWorkToDo = true;
    }

    public void setKitchenState(){
        addWater();
        pourMilk();
        loadDishwasher();
    }

}