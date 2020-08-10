package com.company.task312;

public class GenreByContent extends Genre {

    public GenreByContent(String attribute) {
        super("Жанр по контенту книги");
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        GenreByContent genreByContent = (GenreByContent) obj;

        return this.attribute != null? attribute.equals(genreByContent.attribute) : false;
    }
}
