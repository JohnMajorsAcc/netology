package com.company.task331light;

public class UserReader extends User implements Reader {
    private String name;
    private String sirname;

    public UserReader(String name, String sirname) {
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
    public void getBook(Administrator administrator) {
        System.out.println(this + " берет книгу в библиотеке у " + administrator + ".");
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println(this + " возвращает книгу в библиотеку " + administrator + ".");
    }

    @Override
    public String toString() {
        return this.name + " " + this.sirname + " (" + Reader.profession + ")";
    }
}
