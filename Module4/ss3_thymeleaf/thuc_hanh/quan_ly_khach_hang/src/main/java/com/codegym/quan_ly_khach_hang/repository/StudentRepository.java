package com.codegym.quan_ly_khach_hang.repository;

import com.codegym.quan_ly_khach_hang.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository{
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"Lien","C05",0, new String[]{"JS","Java"}));
        studentList.add(new Student(2,"chanh2","C04",1, new String[]{"PHP","Java"}));
        studentList.add(new Student(3,"Kien","C06",-1, new String[]{"SQL","Java"}));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public boolean add(Student student) {
        return studentList.add(student);
    }

    @Override
    public Student findById(int studentid) {
        for(Student s:studentList) {
            if(s.getId() == studentid){
                return s;
            }
        }
        return null;

        // hoặc
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getId() == studentid) {
//                return studentList.get(i);
//            }
//        }
        // return null;
    }

    @Override
    public boolean update(Student student) {
        for(Student s:studentList){
            if(s.getId() == student.getId()){
                s=student;
                return true;
            }
        }
        return false;

        // cách khác
//            for (int i = 0; i < studentList.size(); i++) {
//                if (studentList.get(i).getId() == student.getId()) {
//                    studentList.set(i, student);
//                    return true;
//                }
//            }
//            return false;

    }

    @Override
    public boolean delete(int studentid) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == studentid) {
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Student> search(String name) {
        List<Student> listSearch = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equalsIgnoreCase(name)) {
                listSearch.add(studentList.get(i));
            }
        }
        return listSearch;
    }
}
