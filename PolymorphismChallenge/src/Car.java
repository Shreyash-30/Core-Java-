public class Car {

    private String description;

    public Car(){

    }
    public Car (String description){
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Engine started for : " + this.getClass().getSimpleName());

    }
    public void drive(){
        System.out.println("Driving car: " + description);
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Running engine for : " + this.getClass().getSimpleName());
    }
}
