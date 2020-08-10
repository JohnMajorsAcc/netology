package com.company.task312;

public class ProseGenre extends GenreByForm {
    public ProseGenre(String attribute) {
        super(attribute);
    }

    @Override
    public String getGenreName() {
        return GenreEnum.PROSE.getDescr();
    }
}
