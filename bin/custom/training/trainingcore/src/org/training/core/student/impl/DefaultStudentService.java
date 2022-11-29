package org.training.core.student.impl;

import org.training.core.model.StudentModel;
import org.training.core.student.StudentService;
import org.training.core.student.dao.StudentDao;

import javax.annotation.Resource;
import java.util.List;

public class DefaultStudentService implements StudentService {

    @Resource(name = "studentDao")
    private StudentDao studentDao;

    @Override
    public List<StudentModel> getAllStudent() {
        return studentDao.getAllStudent();
    }

    @Override
    public StudentModel getStudentById(String id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public StudentModel getStudentByName(String fullName) {
        return studentDao.getStudentByName(fullName);
    }
}
