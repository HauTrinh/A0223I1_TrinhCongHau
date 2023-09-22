package com.example.bai_1.service;

import com.example.bai_1.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> display();
    void save(Student student);
}
