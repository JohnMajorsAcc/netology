package com.company.task331.user;

import com.company.task331.book.Book;
import com.company.task331.book.Library;

public interface Reader {

    void getBook(Library library, Book book);

    void retrieveBook(Book book);
}
