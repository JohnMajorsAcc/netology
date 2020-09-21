package com.company.task342;

public abstract class Event {
    String title;
    int releaseYear;
    int age;

    public abstract String getTitle();
    public abstract int getReleaseYear();
    public abstract int getAge();

    public abstract String toString();
}
