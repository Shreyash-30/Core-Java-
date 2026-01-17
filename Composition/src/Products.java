public class Products {
    private String model;
    private String manufacturer;
    private int weight;
    private int height;
    private int width;


    public Products(String model, String manufacturer, int weight, int height, int width) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public Products(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
    class Monitor extends Products {
        private int size;
        private String resolution;


        Monitor(String model, String manufacturer) {
            super(model, manufacturer);
        }

        Monitor(String model, String manufacturer, int size, String resolution) {
            super(model, manufacturer);
            this.size = size;
            this.resolution = resolution;
        }

        public void drawPixelAt(int x, int y, String color) {
            System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
        }

    }

     class Motherboard extends Products {
        private int ramSlots;
        private int cardSlots;
        private String bios;



        Motherboard(String model, String manufacturer) {
            super(model, manufacturer);
        }
        Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
            super(model, manufacturer);
            this.ramSlots = ramSlots;
            this.cardSlots = cardSlots;
            this.bios = bios;
        }


        public void loadProgram(String programName) {
            System.out.println("Program " + programName + " is now loading...");
        }


    }

     class ComputerCase extends Products {
        private String powerSupply;

        ComputerCase(String model, String manufacturer) {
            super(model, manufacturer);
        }

        ComputerCase(String model, String manufacturer, String powerSupply) {
            super(model, manufacturer);
            this.powerSupply = powerSupply;
        }

        public void pressPowerButton() {
            System.out.println("Power button pressed.");
        }
    }

