package org.training.core.book.dao;

import org.training.core.model.BookModel;

import java.util.List;

public interface BookDao {

    List<BookModel> getAllBook();

    BookModel getBookById (final String id);

    List<BookModel> getBookByGenre (final String genre);

}
