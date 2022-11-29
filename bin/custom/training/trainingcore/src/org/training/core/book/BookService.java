package org.training.core.book;

import org.training.core.model.BookModel;

import java.util.List;

public interface BookService {
    List<BookModel> getAllBook();

    BookModel getBookById (final String id);

    List<BookModel> getBookByGenre (final String genre);

}
