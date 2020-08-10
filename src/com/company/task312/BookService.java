package com.company.task312;

public class BookService {
    public void filterBookByGenre(Book[] bookList, Genre genre) {
        for (Book book : bookList) {
            for (Genre bookGenre : book.getGenres()) {
                if (bookGenre.getAttributeOfGenre().equals(genre.getAttributeOfGenre())) {
                    if (bookGenre.equals(genre)) {
                        System.out.println("Книга " + book.getTitle() + " подходит под данный фильтр, жанр: " + genre.getGenreName());
                        break;
                    } else {
                        System.out.println("Книга " + book.getTitle() + " не подходит под данный фильтр, жанр: " + genre.getGenreName()
                        + ", критерий: " + genre.getAttributeOfGenre() + ", так как имеет жанр " + bookGenre.getGenreName());
                    }
                }
            }
        }
    }
}
