package com.ss11_stack_queue.thuc_hanh;

public class Person<T,U>{
    private T id;
    private U age;

    public Person(T id, U age) {
        this.id = id;
        this.age = age;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public U getAge() {
        return age;
    }

    public void setAge(U age) {
        this.age = age;
    }
}
