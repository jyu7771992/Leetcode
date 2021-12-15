package Q4;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie("movie1", 1990);
        Movie movie2 = new Movie("movie2", 1998);
        Movie movie3 = new Movie("movie3", 2001);
        Movie movie4 = new Movie("movie4", 2002);
        Movie movie5 = new Movie("movie5", 2003);

        Genre genre = new Genre();
        genre.addMovie(movie1);
        genre.addMovie(movie2);
        genre.addMovie(movie3);
        genre.addMovie(movie4);
        genre.addMovie(movie5);

        Netflix netflix = new Netflix();
        netflix.addGenre(genre);

        //classic
        genre.moviesList.stream().filter(movie -> movie.releaseDate < 2000).flatMap(str-> Stream.of("(Classic)" + str)).forEach(System.out::println);
    }
}
