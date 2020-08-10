package com.company;

public enum Country {
    Russia("Российская федерация"),
    UK("Великобритания"),
    USA("Соединенные штаны Америки"),
    Australia("Австралия"),
    Germany("Германия"),
    undefined("не определено");

    private String translation;

    Country(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
