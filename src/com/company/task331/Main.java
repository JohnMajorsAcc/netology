package com.company.task331;


import com.company.task331.book.*;

import com.company.task331.user.LibraryUser;
import com.company.task331.user.Marina;
import com.company.task331.user.User;
import com.company.task331.user.Vasya;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create library
        Library library = Library.getInstance(new ArrayList<Book>());

        // Create users
        User libraryUser = new LibraryUser();
        Vasya vasya = new Vasya();
        Marina marina = new Marina();

        //Books
        Book book1 = new Book("Бродяги Севера", "Джеймс Оливер Кервуд", Status.AVAILABLE, libraryUser );
        Book book2 = new Book("Белый клык", "Джек Лондон", Status.AVAILABLE, libraryUser);
        Book book3 = new Book("Одиссея капитана Блада", "Рафаэль Саббатини", Status.AVAILABLE, libraryUser);
        Book book4 = new Book("Три мушкетера", "Александр Дюма", Status.AVAILABLE, libraryUser);

        //Add books
        library.addBookToList(book1);
        library.addBookToList(book2);
        library.addBookToList(book3);
        library.addBookToList(book4);

        //movers
        BookMover farsm = new FromArchiveStatusMover();
        BookMover favsm = new FromAvailableStatusMover();
        BookMover fbosm = new FromBorrowedStatusMover();
        BookMover fovsm = new FromOverduedStatusMover();

        library.printBookList();

        //users action
        vasya.findBookByTitle(library, "Бродяги Севера");
        vasya.findBookByTitle(library, "Золотоискатели");

        vasya.give(library, book1, marina);

        marina.getBook(library, book2);




    }
}
