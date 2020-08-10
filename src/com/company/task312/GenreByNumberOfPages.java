package com.company.task312;

public class GenreByNumberOfPages extends Genre {

    public GenreByNumberOfPages(String attribute) {
        super("Жанр по количеству страниц");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        GenreByNumberOfPages genreByNumberOfPages = (GenreByNumberOfPages) obj;

        return this.attribute != null? attribute.equals(genreByNumberOfPages.attribute) : false;
    }


}
