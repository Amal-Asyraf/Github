package com.example.a17010596.mymovies;

import java.util.Calendar;

public class MovieList {

    private String title;
    private String year;
    private String rated;
    private String genre;
    private Calendar watched_on;
    private String in_theatre ;
    private String descryption;
    private boolean isPG;

    public MovieList(String title, String year,  String genre,  boolean isPG) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.isPG = isPG;
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

    public Calendar getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }

    public boolean isPG() {
        return isPG;
    }

    public void setPG(boolean PG) {
        isPG = PG;
    }

    @Override
    public String toString() {
        return "MovieList{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", genre='" + genre + '\'' +
                ", isPG=" + isPG +
                '}';
    }
}
