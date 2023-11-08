package com.codegym.quan_ly_khach_hang.service;

import com.codegym.quan_ly_khach_hang.model.Student;
import com.codegym.quan_ly_khach_hang.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSerivce implements IStudentService{
    @Autowired
    private IStudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public boolean add(Student student) {
        return studentRepository.add(student);
    }

    @Override
    public Student findById(int studentid) {
        return studentRepository.findById(studentid);
    }

    @Override
    public boolean update(Student student) {
        return studentRepository.update(student);
    }

    @Override
    public boolean delete(int studentid) {
        return studentRepository.delete(studentid);
    }

    @Override
    public List<Student> search(String name) {
        return studentRepository.search(name);
    }
}
