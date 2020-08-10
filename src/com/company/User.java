package com.company;

public class User {

    public static int totalOnline;

    private String name;
    private String surname;
    private String mail;

    public String getName() {
        return name;
    }

    public User(String name, String surname, String mail) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        totalOnline++;
    }
}
