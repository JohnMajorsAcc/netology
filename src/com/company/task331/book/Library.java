package com.company.task331.book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library library;
    private List<Book> bookList = new ArrayList<>();

    private Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public static Library getInstance(List library){
        if (Library.library == null){
            Library.library = new Library(library);
        }
        return Library.library;

    }

    public void printBookList() {
        bookList.stream().forEach(System.out::println);
        System.out.println();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBookToList(Book book){
        if (checkBook(book)){
            System.out.println("Такая книга уже есть в библиотеке!");
            return;
        } else bookList.add(book);
    }

    public boolean checkBook(Book book){
        return bookList.stream().anyMatch(o -> o.equals(book));
    }
}
