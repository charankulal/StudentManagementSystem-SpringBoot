package com.charan.student_management_system.service;


import com.charan.student_management_system.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    void saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);
}
