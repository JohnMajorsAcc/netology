package com.company.task312;

public class DetectiveGenre extends GenreByContent{

    public DetectiveGenre(String attribute) {
        super(attribute);
    }


    @Override
    public String getGenreName() {
        return GenreEnum.DETECTIVE.getDescr();
    }
}
