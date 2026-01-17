public class PersonalComputer extends Products {

   private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computercase;



    public PersonalComputer(String model, String manufacturer, Monitor monitor, Motherboard motherboard, ComputerCase computercase){
        super(model, manufacturer);
        this.computercase = computercase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public ComputerCase getComputercase() {
        return computercase;
    }

}
