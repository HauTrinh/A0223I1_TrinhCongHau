package com.codegym.quan_ly_student.service;


import com.codegym.quan_ly_student.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    boolean add(Student student);
    Student findById(int id);
}
