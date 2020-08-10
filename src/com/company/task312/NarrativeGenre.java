package com.company.task312;

public class NarrativeGenre extends GenreByNumberOfPages{
    public NarrativeGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.NARRATIVE.getDescr();
    }
}
