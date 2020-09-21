package com.company.task331.book;

import com.company.task331.user.User;

import java.util.Objects;

public class Book{
    private String title;
    private String author;
    private Status status;
    private User owner;

    public Book(String title, String author, Status status, User owner) {
        this.title = title;
        this.author = author;
        this.status = status;
        this.owner = owner;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public User getOwner() {
        return owner;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "\"" + title + "\", " + author + ", статус книги: \"" + status.getDescription() + "\" текущее расположение: " + owner.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, status, owner);
    }
}
