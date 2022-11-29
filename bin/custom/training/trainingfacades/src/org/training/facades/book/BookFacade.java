package org.training.facades.book;

import org.training.facades.book.data.BookData;

import java.util.List;

public interface BookFacade {
    List<BookData> getAllBook();
    BookData getBookById(final String id);
    List<BookData> getBookByGenre(final String genre);
}
