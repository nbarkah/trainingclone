package org.training.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import org.training.core.model.StudentModel;
import org.apache.commons.lang.StringUtils;

public class PrepareInterceptorStudent implements PrepareInterceptor<StudentModel>{

    @Override
    public void onPrepare(StudentModel studentModel, InterceptorContext interceptorContext) throws InterceptorException {
        String studentName = studentModel.getFullName();
        String name= StringUtils.lowerCase(studentName);
        int length=name.length();
        String result="";
        for(int i=0;i<length;i++){
            if(name.substring(i,i+1).contains(",") || name.substring(i,i+1).contains("+")){
                result=result;
            }else if(i==0){
                String letter=name.substring(i,1).toUpperCase();
                result=result+letter;
            }else if(name.substring(i-1,i).contains(" ")){
                String letter=name.substring(i,i+1).toUpperCase();
                result=result+letter;
            }else{
                result=result+name.substring(i,i+1);
            }
        }
        studentModel.setFullName(result);

        String studentPhoneNumber = studentModel.getPhoneNumber();
        if (studentPhoneNumber.contains("+")) {
            studentModel.setPhoneNumber(studentPhoneNumber);
        } else {
            studentModel.setPhoneNumber("+62"+StringUtils.substring(studentPhoneNumber,1));
        }

    }
}