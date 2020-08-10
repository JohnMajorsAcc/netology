package com.company.task312;

public class ProfessionalGenre extends GenreByContent{

    public ProfessionalGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.PROFESSIONAL.getDescr();
    }
}
