package org.training.core.book.impl;

import org.training.core.book.BookService;
import org.training.core.book.dao.BookDao;
import org.training.core.model.BookModel;

import javax.annotation.Resource;
import java.util.List;

public class DefaultBookService implements BookService {

    @Resource(name = "bookDao")
    private BookDao bookDao;

    @Override
    public List<BookModel> getAllBook() {
        return bookDao.getAllBook();
    }

    @Override
    public BookModel getBookById(final String id) {
        return bookDao.getBookById(id);
    }

    @Override
    public List<BookModel> getBookByGenre(final String genre) {
        return bookDao.getBookByGenre(genre);
    }
}
