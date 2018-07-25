package sg.edu.rp.c346.mymovies;

import java.util.Calendar;

public class Movie {
    private String title;
    private String year;
    private String rated;
    private String genre;
    private Calendar watchOn;
    private String in_theatre;
    private String description;
    private int rating;

    public Movie(String title, String year, String rated, String genre, Calendar watchOn, String in_theatre, String description, int rating) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.watchOn = watchOn;
        this.in_theatre = in_theatre;
        this.description = description;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatchOn() {
        return watchOn;
    }

    public void setWatchOn(Calendar watchOn) {
        this.watchOn = watchOn;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", genre='" + genre + '\'' +
                ", watchOn=" + watchOn +
                ", in_theatre='" + in_theatre + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
