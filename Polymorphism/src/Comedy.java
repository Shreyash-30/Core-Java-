public class Comedy extends Movie{

    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.println("Watching a comedy movie: " + super.title);
    }
}
