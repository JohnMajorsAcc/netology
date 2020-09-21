package com.company.task331.user;

import com.company.task331.book.*;

public class Marina extends User implements Reader {

    private String name = "Marina";
    private BookMover favsm = new FromAvailableStatusMover();
    private BookMover fbosm = new FromBorrowedStatusMover();

    @Override
    public void getBook(Library library, Book book) {
        if (library.checkBook(book) && book.getStatus().equals(Status.AVAILABLE)) {
            favsm.moveToStatus(book, Status.BORROWED);
            book.setOwner((this));
            library.printBookList();
            System.out.println();
        }
    }

    @Override
    public void retrieveBook(Book book) {

    }

    @Override
    public String getName() {
        return name;
    }
}
