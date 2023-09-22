package com.example.bai_1.repository;

import com.example.bai_1.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements  IStudentRepository{
    static List<Student> students = new ArrayList<>();
    static {
        students = new ArrayList<>();
        // Khởi tạo danh sách sinh viên
        students.add(new Student(1, "John",true, 9.6));
        students.add(new Student(2, "Alice",false, 8.5));
        students.add(new Student(3, "Bob",true, 5.8));
        students.add(new Student(4, "Emily",false, 7.3));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void create(Student student) {
        students.add(student);
    }
}
