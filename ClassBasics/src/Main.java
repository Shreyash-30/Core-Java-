public class Main {
    public static void main(String[] args) {

        Student student = new Student();
//        student.college = "ABC College";
//        student.course = "Computer Science";
//        //set private variable using setter methods
//        student.setName("John Doe");
//        student.setAge(19);
//        student.setRoll(21);
        //retrieve private variable using getter methods
         Student student2 = new Student("Alice", 20, 15, "XYZ University", "Electrical Engineering");
            Student student3 = new Student("Bob", 22, 10);
            Student student4 = new Student("Charlie", 21, 12, "LMN Institute");

        student.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();




    }
}
