package com.codegym.quan_ly_student.repository;

import com.codegym.quan_ly_student.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    boolean add(Student student);
    Student findById(int id);
}
