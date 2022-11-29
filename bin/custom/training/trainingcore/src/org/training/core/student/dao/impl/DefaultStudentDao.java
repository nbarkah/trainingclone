package org.training.core.student.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;
import org.training.core.model.StudentModel;
import org.training.core.student.dao.StudentDao;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

public class DefaultStudentDao implements StudentDao {
    @Resource(name = "flexibleSearchService")
    private FlexibleSearchService flexibleSearchService;

    final private static String ALL_STUDENT_QUERY = "SELECT {pk} FROM {Student}";
    final private static String STUDENT_QUERY_BY_ID = ALL_STUDENT_QUERY + "WHERE {id}=?id";
    final private static String STUDENT_QUERY_BY_NAME = ALL_STUDENT_QUERY + "WHERE {fullName}=?fullName";

    @Override
    public List<StudentModel> getAllStudent() {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ALL_STUDENT_QUERY);
        final SearchResult<StudentModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
        final List<StudentModel> result = searchResult.getResult();
        if (CollectionUtils.isNotEmpty(result)) {
            return result;
        }

        return Collections.emptyList();
    }

    @Override
    public StudentModel getStudentById(final String id) {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(STUDENT_QUERY_BY_ID);
        flexibleSearchQuery.addQueryParameter(StudentModel.ID, id);
        final SearchResult<StudentModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
        final List<StudentModel> result = searchResult.getResult();
        if (CollectionUtils.isNotEmpty(result)) {
            return result.get(0);
        }
        return null;
    }

    @Override
    public StudentModel getStudentByName(final String fullName) {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(STUDENT_QUERY_BY_NAME);
        flexibleSearchQuery.addQueryParameter(StudentModel.FULLNAME, fullName);
        final SearchResult<StudentModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
        final List<StudentModel> result = searchResult.getResult();
        if (CollectionUtils.isNotEmpty(result)) {
            return result.get(0);
        }
        return null;
    }
}
