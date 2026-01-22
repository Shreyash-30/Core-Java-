public class Main {
    public static void main(String[] args) {
        //treating dog as an animal object
        Animal dog = new Animal("Buddy", 3, "Golden Retriever", 30);
        dog.move();
        dog.displayInfo();
       // treating dog as a dog object
        Dog dog2 = new Dog("Max", 4, "Beagle", 20);
        dog2.move();
        dog2.displayInfo();
        dog2.bark();

        //Inherited dog from animal
        Dog dog3 = new Dog("Charlie", 2, "Labrador", 25, "Labrador", "Yellow");
        dog3.move();
        dog3.displayInfo();
        dog3.bark();



    }
}
