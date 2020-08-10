package com.company.task312;

public class NovelGenre extends GenreByNumberOfPages {
    public NovelGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.NOVEL.getDescr();
    }
}
