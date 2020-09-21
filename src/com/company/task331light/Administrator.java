package com.company.task331light;

public interface Administrator {
    String profession = "<Администратор>";
    void findBook();
    void giveOutBook(Reader reader);
    void overdueNotification(Reader reader);
}
