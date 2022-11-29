package org.training.core.student;

import org.training.core.model.StudentModel;

import java.util.List;

public interface StudentService {
    List<StudentModel> getAllStudent();

    StudentModel getStudentById (final String id);

    StudentModel getStudentByName (final String fullName);
}
