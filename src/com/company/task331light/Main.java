package com.company.task331light;

public class Main {
    public static void main(String[] args) {
        UserAdminSuppl vadim = new UserAdminSuppl("Вадим", "Петров"); //Supplier & Administrator
        UserReader marina  = new UserReader("Марина", "Иванова"); //Reader
        UserLibrReader userLibrReader = new UserLibrReader("Никита", "Сидоров");// Librarian & Reader


        vadim.giveOutBook(marina);
        vadim.bringBookToLibrary(userLibrReader);
        vadim.findBook();
        vadim.overdueNotification(userLibrReader);

        System.out.println();

        marina.getBook(vadim);
        marina.returnBook(vadim);

        System.out.println();

        userLibrReader.orderBook(vadim);
        userLibrReader.getBook(vadim);
        userLibrReader.returnBook(vadim);

    }
}
