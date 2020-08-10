package com.company.task312;

public class StoryGenre extends GenreByNumberOfPages {

    public StoryGenre(String attribute) {
        super(attribute);
    }


    @Override
    public String getGenreName() {
        return GenreEnum.STORY.getDescr();
    }
}
