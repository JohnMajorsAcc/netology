package com.company.task311;

public enum Status {
    BORROWED("взято в пользование"),
    ARCHIVED("в архиве"),
    AVAILABLE("доступно"),
    OVERDUED("задержано"),
    UNKNOWN("непоняяяятноооо");

    private String description;

    Status(String description) {
        this.description = description.toUpperCase();
    }

    Status() {
    }

    public String getDescription() {
        return description;
    }
}
