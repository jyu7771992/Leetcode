package Q4;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    List<Movie> moviesList;

    public Genre() {
        moviesList = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        moviesList.add(movie);
    }
}
