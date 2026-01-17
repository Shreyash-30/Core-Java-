public class Main {


    public static void main(String[] args) {
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, "2540x1440");
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        ComputerCase computerCase = new ComputerCase("220B", "Dell", "500W");
        Products products = new Products("GenericModel", "GenericManufacturer");
        PersonalComputer pc = new PersonalComputer("MyPC", "Dell", monitor, motherboard, computerCase);
        pc.getMonitor().drawPixelAt(2,3,"red");
        pc.getMotherboard().loadProgram("Windows 1.0");
        pc.getComputercase().pressPowerButton();

        Products monitor1 = new Monitor("27inch Beast", "Acer", 27, "2540x1440");
        
        System.out.println();
    }
}
