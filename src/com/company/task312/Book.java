package com.company.task312;

public class Book {
    private String title;
    private Genre[] genres;

    public Book(String title, Genre[] genres) {
        this.title = title;
        this.genres = genres;
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Genre[] getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
