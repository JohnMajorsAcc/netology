package com.company.task342;

public class Theater extends Event{
    private String title;
    private int releaseYear;
    private int age;

    public Theater(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Theater(" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
