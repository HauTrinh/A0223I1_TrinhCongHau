package com.example.bai_1.service;

import com.example.bai_1.model.Student;
import com.example.bai_1.repository.IStudentRepository;
import com.example.bai_1.repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService{
    private IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public List<Student> display() {
        return iStudentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        iStudentRepository.create(student);
    }
}
