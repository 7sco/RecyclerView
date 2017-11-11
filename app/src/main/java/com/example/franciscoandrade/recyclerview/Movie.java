package com.example.franciscoandrade.recyclerview;

public class Movie {
    String title;
    String director;
    String year;

    int picture;

    public Movie(String title, String director, String year, int picture) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.picture=picture;
    }
    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public String getYear() {
        return year;
    }
    public int getPicture() {
        return picture;
    }
}
