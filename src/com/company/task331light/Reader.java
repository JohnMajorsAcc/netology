package com.company.task331light;

public interface Reader {
    final String profession = "<Читатель>";
    void getBook(Administrator administrator);
    void returnBook(Administrator administrator);
}
