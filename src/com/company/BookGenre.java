package com.company;

public enum BookGenre {
    SF_HISTORY("Альтернативная история"),
    SF_ACTION("Боевая фантастика"),
    SF_FANTASY("Фэнтези"),
    GUIDES("Справочники"),
    STUDY("Учёба"),
    PROSE_HISTORY("Историческая проза"),
    PROSE_MILITARY("Военная проза"),
    ADV_INDIAN("Вестерн"),
    SF_CYBERPUNK("Киберпанк"),
    ADVENTURE("Приключения"),
    NOT_INDICATED("Не указано");

    private String translation;

    BookGenre(String translation) {
        this.translation = translation;
    }

    public String getTranslation(){
        return this.translation;
    }

}
