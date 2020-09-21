package com.company.task331light;

public final class UserAdminSuppl extends User implements Administrator, Supplier{
    private String name ;
    private String sirname;


    public UserAdminSuppl(String name, String sirname) {
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
    public void findBook() {
        System.out.println(this + " ищет запрошенную книгу." );
    }

    @Override
    public void giveOutBook(Reader reader) {
        System.out.println(this + " передает " + reader + " запрошенную книгу." );
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(this + " уведомляет о просрочке взятой книги " + reader + "." );
    }

    @Override
    public void bringBookToLibrary(Librarian librarian) {
        System.out.println(this + " передает " + librarian + " запрошенную книгу." );
    }

    @Override
    public String toString() {
        return this.name + " " + this.sirname + " (должности: " + Administrator.profession + " и " + Supplier.profession + ")";
    }
}
