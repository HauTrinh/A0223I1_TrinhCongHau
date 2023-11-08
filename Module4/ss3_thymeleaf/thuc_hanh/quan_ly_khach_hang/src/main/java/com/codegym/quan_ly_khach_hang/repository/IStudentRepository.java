package com.codegym.quan_ly_khach_hang.repository;


import com.codegym.quan_ly_khach_hang.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    boolean add(Student student);
    Student findById(int studentid);
    boolean update(Student student);
    boolean delete(int studentid);
    List<Student> search(String name);
}
