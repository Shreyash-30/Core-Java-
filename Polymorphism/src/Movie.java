public class Movie {
    String title;


    public Movie(String title) {
        this.title = title;

    }

    public void watchMovie(){
        System.out.println(this.getClass().getSimpleName() );
        System.out.println("Watching movie: " + title + " " + "of genre " );
    }

    public static Movie getMovie(String title, String type){

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Action(title);
            case 'C'-> new Comedy(title);
            case 'S' -> new Adventure(title);
            default -> new Movie(title);
        };
    }
}
