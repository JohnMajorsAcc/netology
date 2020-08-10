package com.company.task312;

public class FantasticGenre extends GenreByContent{
    public FantasticGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.FANTASTIC.getDescr();
    }
}
