package com.ss11_stack_queue.thuc_hanh;

public class Main {
    public static void main(String[] args) {
        Person<Integer,Integer> person1 = new Person<>(1,20);
        System.out.println("Thông tin person 1: " +person1.getId()+ " và " + person1.getAge());

        Person<Double,String> person2 = new Person<>(2.0,"29");
        System.out.println("Thông tin person 2: " +person2.getId()+ " và " + person2.getAge());

        Person<String,Double> person3 =new Person<>("3", 35.5);
        System.out.println("Thông tin person 3: " +person3.getId()+ " và " + person3.getAge());
    }
}
