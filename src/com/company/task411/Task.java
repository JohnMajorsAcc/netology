package com.company.task411;

import java.time.LocalTime;

public class Task {
    private String name;
    private LocalTime time;
    private String description;

    public Task() {
    }

    public Task(String name, LocalTime time, String description) {
        this.name = name;
        this.time = time;
        this.description = description;
    }

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Задача '" +  name + '\'' + ", время: " + time +
                ", описание '" + description + '\'';
    }
}
