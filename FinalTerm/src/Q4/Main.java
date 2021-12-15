package Q4;

import sun.nio.ch.Net;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Netflix netFlix = new Netflix();
        Genre romance = createSusThriGenre();
        Genre suspenThri = createRomanceGenre();
        netFlix.addGenre(romance);
        netFlix.addGenre(suspenThri);

        /*For all movies released before 2000, add the string "(Classic)" to the title of the movie using  flatMap.*/
        Date year2000 = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Predicate<Movie> before2000 = movie -> movie.getReleaseDate().before(year2000);

        System.out.println("----------------1. For all movies released before 2000, add the string \"(Classic)\" to the title of the movie using  flatMap---------------->");
        netFlix.genreList.stream().flatMap(genre -> genre.getMoviesList().stream()).filter(before2000)
                .forEach(movie -> System.out.println(movie.getTitle() + " (Classic)"));

        System.out.println("----------------2. Get the latest 3 movies released using .limit() method of stream---------------->");
        netFlix.genreList.stream().flatMap(genre -> genre.getMoviesList().stream())
                .sorted((m1,m2) -> m2.getReleaseDate().compareTo(m1.getReleaseDate()))
                .limit(3)
                .forEach(movie -> System.out.println(movie.getTitle() + " release year: " + getYear(movie.getReleaseDate())));

        System.out.println("----------------3. Get Movies between 1990 and 2000---------------->");
        Date year1990 = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Predicate<Movie> after1990 = movie -> movie.getReleaseDate().after(year1990);
        netFlix.genreList.stream().flatMap(genre -> genre.getMoviesList().stream()).filter(before2000).filter(after1990)
                .forEach(movie -> System.out.println(movie.getTitle() + " release year: " + getYear(movie.getReleaseDate())));

        System.out.println("<----------------4. Add release Year ---------------->");
        netFlix.genreList.stream().flatMap(genre -> genre.getMoviesList().stream())
                .forEach(movie -> System.out.println(movie.getTitle() + " release year: " + getYear(movie.getReleaseDate())));

        System.out.println("----------------5. Sorting based on title---------------->");
        netFlix.genreList.stream().flatMap(genre -> genre.getMoviesList().stream())
                .sorted((m1,m2) -> m1.getTitle().compareTo(m2.getTitle()))
                .forEach(movie -> System.out.println(movie.getTitle() + " release year: " + getYear(movie.getReleaseDate())));
    }
    private static Genre createSusThriGenre(){
        Genre suspenseThriller = new Genre("Suspense thriller");
        Date date = new GregorianCalendar(2018, Calendar.FEBRUARY, 1).getTime();
        Movie movie1 = new Movie("susThri-1", date, getListActors(), "Director_1");
        date = new GregorianCalendar(1976, Calendar.JANUARY, 1).getTime();
        Movie movie2 = new Movie("susThri-2", date, getListActors(), "Director_2");
        date = new GregorianCalendar(1980, Calendar.AUGUST, 1).getTime();
        Movie movie3 = new Movie("susThri-3", date, getListActors(), "Director_3");
        date = new GregorianCalendar(2021, Calendar.JANUARY, 1).getTime();
        Movie movie4 = new Movie("susThri-4", date, getListActors(), "Director_4");

        suspenseThriller.addMovie(movie1);
        suspenseThriller.addMovie(movie2);
        suspenseThriller.addMovie(movie3);
        suspenseThriller.addMovie(movie4);

        return suspenseThriller;

    }
    private static Genre createRomanceGenre(){
        Genre romance = new Genre("Romance");
        Date date = new GregorianCalendar(2011, Calendar.FEBRUARY, 1).getTime();
        Movie movie1 = new Movie("Romance-1", date, getListActors(), "Director_1");
        date = new GregorianCalendar(1987, Calendar.JANUARY, 1).getTime();
        Movie movie2 = new Movie("Romance-2", date, getListActors(), "Director_2");
        date = new GregorianCalendar(1995, Calendar.AUGUST, 1).getTime();
        Movie movie3 = new Movie("Romance-3", date, getListActors(), "Director_3");
        date = new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime();
        Movie movie4 = new Movie("Romance-4", date, getListActors(), "Director_4");

        romance.addMovie(movie1);
        romance.addMovie(movie2);
        romance.addMovie(movie3);
        romance.addMovie(movie4);

        return romance;
    }


    private static ArrayList<String> getListActors(){
        ArrayList<String> actors = new ArrayList<>();
        actors.add("Actor_1");
        actors.add("Actor_2");
        actors.add("Actor_3");
        actors.add("Actor_4");
        actors.add("Actor_5");
        return actors;
    }

    private static String getYear(Date date){
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        return yearFormat.format(date);
    }


}
