package sg.edu.rp.c346.mymovies;

import java.util.Calendar;

public class MovieItem {
    private String movieName;
    private String year;
    private String genre;
    private String watchedOn;
    private String inTheater;
    private String description;
    private String rated;
    private int star;

    public MovieItem(String movieName, String year, String genre, String rated, String watchedOn, String inTheater, String description, int star) {
        this.movieName = movieName;
        this.year = year;
        this.genre = genre;
        this.watchedOn = watchedOn;
        this.inTheater = inTheater;
        this.description = description;
        this.rated = rated;
        this.star = star;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWatchedOn() {
        return watchedOn;
    }

    public void setWatchedOn(String watchedOn) {
        this.watchedOn = watchedOn;
    }

    public String getInTheater() {
        return inTheater;
    }

    public void setInTheater(String inTheater) {
        this.inTheater = inTheater;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "movieName='" + movieName + '\'' +
                ", year='" + year + '\'' +
                ", genre='" + genre + '\'' +
                ", watchedOn='" + watchedOn + '\'' +
                ", inTheater='" + inTheater + '\'' +
                ", description='" + description + '\'' +
                ", rated='" + rated + '\'' +
                ", star=" + star +
                '}';
    }

}
