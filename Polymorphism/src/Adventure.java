public class Adventure extends Movie{

    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.println("Enjoy the thrilling adventure in: " + super.title);
    }

}
