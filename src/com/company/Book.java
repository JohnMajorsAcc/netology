package com.company;

public class Book {
    private Author author;
    private String title;
    private BookGenre bookGenre;
    private int pages;
    private int year;

    public Book() {
    }

    public Book(Author author, String title, BookGenre bookGenre, int pages, int year) {
        this.author = author;
        this.bookGenre = bookGenre;
        this.pages = pages;
        this.year = year;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title=" + title +
                ", bookGenre=" + bookGenre +
                ", pages=" + pages +
                ", year=" + year +
                '}';
    }
}
