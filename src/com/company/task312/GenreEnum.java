package com.company.task312;

public enum GenreEnum {
    STORY("Повесть"),
    NOVEL("Роман"),
    NARRATIVE("Рассказ"),
    PROSE("Проза"),
    VERSE("Стих"),
    FANTASTIC("Фантастика"),
    DETECTIVE("Детектив"),
    PROFESSIONAL("Проф. литература");

    private String descr;

    GenreEnum(String descr) {
        this.descr = descr;
    }

    public String getDescr() {
        return descr;
    }
}
