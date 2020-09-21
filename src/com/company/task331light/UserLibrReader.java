package com.company.task331light;

public class UserLibrReader extends User implements Librarian, Reader {
    private String name;
    private String sirname;

    public UserLibrReader(String name, String sirname) {
        this.name = name;
        this.sirname = sirname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSirname() {
        return sirname;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println(this + " заказывает книгу в библиотеку у " + supplier + ".");

    }

    @Override
    public void getBook(Administrator administrator) {
        System.out.println(this + " берет книгу в библиотеке у " + administrator + ".");

    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println(this + " возвращает книгу в библиотеку " + administrator + ".");

    }

    @Override
    public String toString() {
        return this.name + " " + this.sirname + " (должности: " + Librarian.profession + " и " + Reader.profession + ")";

    }
}
