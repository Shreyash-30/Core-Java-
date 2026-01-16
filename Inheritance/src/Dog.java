public class Dog extends Animal {

    String breed;
    String color;
  Dog(){
    super("Buddy", 3, "Golden Retriever", 30);
  }
  Dog(String name, int age, String type, int weight){
        super(name, age, type, weight);
  }

  Dog(String breed, String color, int age) {
        super("Buddy", age, "Dog", 25);
        this.breed = breed;
        this.color = color;
  }
  Dog(String name, int age, String type, int weight, String breed, String color) {
        super(name, age, type, weight);
        this.breed = breed;
        this.color = color;
    }


    //inheriting from Animal class
    //Dog is a subclass of Animal
    //saves code reusability and avoid duplication
    // here we can define only dog specific behaviors
//    private String name;
//    int age;
//    String type;
//    int weight;

//    public Dog(String name, int age, String type, int weight) {
//        this.name = name;
//        this.age = age;
//        this.type = type;
//        this.weight = weight;
//    }


//    public void move() {
//        System.out.println(this.name + " is moving.");
//    }
//    public void displayInfo() {
//        System.out.println("Name: " + this.name);
//        System.out.println("Age: " + this.age);
//        System.out.println("Type: " + this.type);
//        System.out.println("Weight: " + this.weight + " kg");
//        System.out.println("-----------------------");
//    }
    public void bark() {
        System.out.println(this.name + " says Woof Woof!");
    }

}
