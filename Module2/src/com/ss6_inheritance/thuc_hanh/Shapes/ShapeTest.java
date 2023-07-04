package com.ss6_inheritance.thuc_hanh.Shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        System.out.println(shapes);

        shapes = new Shapes("red", false);
        System.out.println(shapes);
    }
}
