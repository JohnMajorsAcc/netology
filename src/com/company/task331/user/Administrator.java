package com.company.task331.user;
import com.company.task331.book.Book;
import com.company.task331.book.Library;

import java.util.List;


public interface Administrator {
    void findBookByTitle(Library library, String title);
    void give(Library library, Book book, Reader reader);
    void overdueNotification(Reader reader, Book book);
}
