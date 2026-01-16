public class Student {

    // private attributes -> only accessible within this class
    private String name;
    private int age;
    private int roll;

    //public variables -> accessible from any class
    public String college;
    //protected variable -> accessible within the same package and inherited classes
    protected String course;

    //Constructor-> special method to initialize objects
    //types -> default constructor , parameterized constructor
    // default constructor-> no parameters
    // initializes attributes with default values
    // parameterized constructor -> with parameters
    // initializes attributes with provided values through arguments
    //this keyword -> refers to current object instance
    // used to differentiate between class attributes and parameters with same name
    // ex-> this.name = name;

    // default constructor
    public Student(){
        this.name = "John Deo";
        this.age = 19;
        this.roll = 21;
        this.college = "Anna University";
        this.course = "Computer Science";
    }

    public Student(String name, int age, int roll, String college, String course){
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.college = college;
        this.course = course;
    }
    //constructor overloading -> multiple constructors with different parameter lists
    // allows creation of objects in different ways
    //constructor chaining -> calling one constructor from another using this()
    // helps to avoid code duplication and maintain consistency

    public Student(String course, String college){
        this.course = course;
        this.college = college;
    }
    public Student(String name, int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }
    public Student(String name, int age, int roll, String college){
        this(name, age, roll, college, "Computer Science");
    }



    // to set private attribute , we use setter methods
    // to retrieve private attribute , we use getter methods

//    public void setName(String name){
//        this.name = name;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//    public void setRoll(int roll){
//        this.roll = roll;
//    }
//
//    public String getName(){
//        return name;
//    }
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll: " + this.roll);
        System.out.println("College: " + this.college);
        System.out.println("Course: " + this.course);
        System.out.println("-----------------------");
    }


}
