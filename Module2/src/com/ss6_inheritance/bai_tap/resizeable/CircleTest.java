package com.ss6_inheritance.bai_tap.resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        System.out.println("Trước khi tăng: "+circle.getArea());
        System.out.print("Sau khi tăng: ");
        circle.resize(20);
    }
}
