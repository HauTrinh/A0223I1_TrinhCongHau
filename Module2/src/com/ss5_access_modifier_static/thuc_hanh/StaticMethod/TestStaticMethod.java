package com.ss5_access_modifier_static.thuc_hanh.StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(111, "Trang");
        Student student2 = new Student(222, "Hanh");
        student1.display();
        student2.display();
    }
}
