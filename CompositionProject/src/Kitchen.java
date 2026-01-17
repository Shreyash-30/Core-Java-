public class Kitchen {

    String type;

    public Kitchen(String type) {
        this.type = type;
    }
}
class Refrigerator extends Kitchen{
    boolean hasWorkToDo;

    public Refrigerator(String type) {
        super(type);

    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering food...");
            hasWorkToDo = false;
        } else {
            System.out.println("No need to order food.");
        }
    }
}
class DishWasher extends Kitchen{
    boolean hasWorkToDo;

        DishWasher(String type) {
            super(type);

        }

        public void doDishes(){
            if(hasWorkToDo){
                System.out.println("Doing the dishes...");
                hasWorkToDo = false;
            } else {
                System.out.println("No dishes to wash.");
            }
        }
}

class CoffeeMaker extends Kitchen{
    boolean hasWorkToDo;

    CoffeeMaker(String type) {
        super(type);

    }

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing coffee...");
            hasWorkToDo = false;
        } else {
            System.out.println("No need to brew coffee.");
        }
    }
}
