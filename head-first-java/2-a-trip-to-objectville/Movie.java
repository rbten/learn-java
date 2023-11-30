public class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }
}
class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Titanic";
        one.genre = "Romantic";
        one.rating = 9;
        one.playIt();
    }
}