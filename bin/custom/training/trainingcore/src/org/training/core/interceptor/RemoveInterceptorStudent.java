package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PersistenceOperation;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import org.apache.commons.collections.CollectionUtils;
import org.training.core.model.StudentModel;

public class RemoveInterceptorStudent implements RemoveInterceptor<StudentModel> {
    @Override
    public void onRemove(StudentModel studentModel, InterceptorContext interceptorContext) throws InterceptorException {
        if (CollectionUtils.isNotEmpty(studentModel.getBooks())){
            interceptorContext.registerElementFor(studentModel, PersistenceOperation.DELETE);
            throw new InterceptorException(
                    String.format("cant remove!!!!", studentModel.getBooks())
            );
        }
    }
}
