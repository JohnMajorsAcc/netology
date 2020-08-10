package com.company.task312;

public class GenreByForm extends Genre{

    public GenreByForm(String attribute) {
        super("Жанр по форме текста");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        GenreByForm genreByForm = (GenreByForm) obj;

        return this.attribute != null? attribute.equals(genreByForm.attribute) : false;
    }
}
