package com.company.task311;

public class Book {
    private String title;
    private String author;
    private Status status;

    public Book() {
    }

    public Book(String title, String author, Status status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\"" + title + "\", " + author + ", статус книги: \"" + status.getDescription() + "\"";
    }
}
