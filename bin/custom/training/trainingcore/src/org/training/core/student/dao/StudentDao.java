package org.training.core.student.dao;

import org.training.core.model.StudentModel;

import java.util.List;

public interface StudentDao {
    List<StudentModel> getAllStudent();

    StudentModel getStudentById (final String id);

    StudentModel getStudentByName (final String fullName);
}
