public class Action extends Movie{

    public Action(String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.println("Get ready for some high-octane action in: " + super.title);
    }
}
