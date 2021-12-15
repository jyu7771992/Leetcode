package Q4;

import java.util.ArrayList;
import java.util.List;

public class Netflix {
    ArrayList<Genre> genreList;

    public Netflix () {
        this.genreList = new ArrayList<>();
    }

    public void addGenre(Genre genre) {
        this.genreList.add(genre);
    }
}
