public class Main {
    public static void main(String[] args) {
//        Movie m1= new Movie("Inception");
//        m1.watchMovie();
//
//        Movie m2 = new Adventure("Indiana Jones");
//        m2.watchMovie();
//
//        Movie m3 = new Comedy("The Hangover");
//        m3.watchMovie();
//
//        var m4 = new Movie("Tomb Raider");
//        m4.watchMovie();

//        Movie movie = Movie.getMovie("The Dark Knight", "Action");
//        movie.watchMovie();
//        Movie movie1 = Movie.getMovie("Jumanji", "Science");
//        movie1.watchMovie();
//
//        Comedy comedy =(Comedy) Movie.getMovie("Superbad", "Comedy");
//        comedy.watchMovie();
//
        var movie = Movie.getMovie("Pirates of the Caribbean", "Action");

        if(movie instanceof Adventure adventureMovie){
            adventureMovie.watchMovie();
        }
        else{
            System.out.println("The movie is not of Adventure genre.");
        }
    }
}
