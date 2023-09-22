package com.example.bai_1.repository;

import com.example.bai_1.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void create(Student student);
}
