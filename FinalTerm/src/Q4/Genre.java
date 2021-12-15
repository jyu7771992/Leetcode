package Q4;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    String name;
    ArrayList<Movie> moviesList;

    public Genre(String name)
    {
        this.name = name;
        moviesList = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        this.moviesList.add(movie);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Movie> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(ArrayList<Movie> moviesList){
        this.moviesList = moviesList;
    }}
