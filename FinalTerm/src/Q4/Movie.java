package Q4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie {
    String title;
    int releaseDate;
    List<String> actors;
    List<String> directors;

    public Movie(String title, int releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public void addActors(String actor) {
        actors.add(actor);
    }

    public void addDirectors(String director) {
        directors.add(director);
    }

}
