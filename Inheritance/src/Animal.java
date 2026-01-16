public class Animal {
    String name;
   int age;
   String type;
   int weight;


   public Animal(String name, int age, String type, int weight) {
       this.name = name;
       this.age = age;
       this.type = type;
       this.weight = weight;
   }

   public void move() {
       System.out.println(this.name + " is moving.");
   }
   public void displayInfo() {
       System.out.println("Name: " + this.name);
       System.out.println("Age: " + this.age);
       System.out.println("Type: " + this.type);
       System.out.println("Weight: " + this.weight + " kg");
       System.out.println("-----------------------");
   }

}


