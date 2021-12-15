package Q4;

import java.util.ArrayList;
import java.util.List;

public class Netflix {
    List<Genre> genreList;

    public Netflix () {
        genreList = new ArrayList<>();
    }
    public void addGenre(Genre genre) {
        genreList.add(genre);
    }
}
