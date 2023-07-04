package com.ss5_access_modifier_static.bai_tap.only_write;

public class Student {
    private String name;
    private String classes;

    public Student() {
        name = "John";
        classes = "C02";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display() {
        System.out.println("Ten: " + this.name + " va lop: " +this.classes);
    }
}
