package com.company.task341;

public class User {
    private int id;
    private String firstName;
    private String secondName;
    private String login;
    private String password;
    private String email;
    private int age;

    public User(int id, String firstName, String secondName, String login, String password, String email, int age) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
