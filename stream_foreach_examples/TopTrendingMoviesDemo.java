import java.util.*;
import java.util.stream.Collectors;

class Movie {
    private String title;
    private double rating;
    private int year;
    public Movie(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }
    public double getRating() { return rating; }
    public int getYear() { return year; }
    public String getTitle() { return title; }
    @Override public String toString() {
        return title + " (" + year + ") Rating: " + rating;
    }
}

public class TopTrendingMoviesDemo {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 4.5, 2023),
            new Movie("Movie B", 4.8, 2024),
            new Movie("Movie C", 4.7, 2022),
            new Movie("Movie D", 4.9, 2024),
            new Movie("Movie E", 4.6, 2023),
            new Movie("Movie F", 4.3, 2024)
        );

        movies.stream()
            .filter(m -> m.getYear() >= 2023)
            .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
            .limit(5)
            .forEach(System.out::println);
    }
}
