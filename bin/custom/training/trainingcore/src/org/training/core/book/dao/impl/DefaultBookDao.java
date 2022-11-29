package org.training.core.book.dao.impl;


import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;
import org.training.core.book.dao.BookDao;
import org.training.core.model.BookModel;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

public class DefaultBookDao implements BookDao {

    @Resource(name = "flexibleSearchService")
    private FlexibleSearchService flexibleSearchService;

    final private static String ALL_BOOKS_QUERY = "SELECT {pk} FROM {Book}";
    final private static String BOOK_QUERY_BY_ID = ALL_BOOKS_QUERY + "WHERE {id}=?id";
    final private static String BOOK_QUERY_BY_GENRE = "SELECT {b.pk} FROM {Book AS b JOIN BookEnum AS be ON {b.genre} " +
            "LIKE CONCAT ( '%', CONCAT({be.pk} , '%' ))} WHERE {be.code}=?genre";

    @Override
    public List<BookModel> getAllBook() {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ALL_BOOKS_QUERY);
        final SearchResult<BookModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
        final List<BookModel> result = searchResult.getResult();
        if (CollectionUtils.isNotEmpty(result)) {
            return result;
        }

        return Collections.emptyList();
    }

    @Override
    public BookModel getBookById(final String id) {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(BOOK_QUERY_BY_ID);
        flexibleSearchQuery.addQueryParameter(BookModel.ID, id);
        final SearchResult<BookModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
        final List<BookModel> result = searchResult.getResult();
        if (CollectionUtils.isNotEmpty(result)) {
            return result.get(0);
        }
        return null;
    }

    @Override
    public List<BookModel> getBookByGenre(final String genre) {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(BOOK_QUERY_BY_GENRE);
        flexibleSearchQuery.addQueryParameter("genre", genre);
        final SearchResult<BookModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
        final List<BookModel> result = searchResult.getResult();
        if (CollectionUtils.isNotEmpty(result)) {
            return result;
        }
        return Collections.emptyList();
    }
}