package com.company.task331.user;

import com.company.task331.book.*;

import java.util.List;

public class Vasya extends User implements Administrator {

    private String name = "Vasiliy";
    private BookMover favsm = new FromAvailableStatusMover();

    public String getName() {
        return name;
    }

    @Override
    public void findBookByTitle(Library library, String title) {
        System.out.println("Ищем книгу с названием " + title);
        Book book = library.getBookList().stream().filter(o -> o.getTitle().equals(title)).findFirst().orElse(null);
        if (book != null) {
            System.out.println("Такая книга есть в библиотеке.");
            System.out.println(book);
        } else {
            System.out.println("Такой книги нет в библиотеке.");
        }
        System.out.println();
    }


    @Override
    public void give(Library library, Book book, Reader reader) {
        if (library.checkBook(book) && book.getStatus().equals(Status.AVAILABLE) ){
            favsm.moveToStatus(book, Status.BORROWED);
            book.setOwner((User)reader);
            library.printBookList();
            System.out.println();
        }
    }

    @Override
    public void overdueNotification(Reader reader, Book book) {

    }
}
