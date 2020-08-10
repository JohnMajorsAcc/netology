package com.company.task312;

public class VerseGenre extends GenreByForm {
    public VerseGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.VERSE.getDescr();
    }
}
