package com.ss7_abstract_interface.bai_tap.codegym;

import com.ss6_inheritance.bai_tap.resizeable.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3.5, "indigo", false);
        shapes[1] = new Square("Blue", true, 3.5);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) { // nếu shape là 1 đối tượng của Circle : nghĩa là new với Circle
                System.out.println(shape); // hiển thị toString của Circle.
                Circle circle = (Circle) shape; // ép kiểu shape về lại từ cha về con: Shape -> Circle : để gọi các phương thức trong Circle
                System.out.println("Diện tích trước khi tăng: " + circle.getArea());
            } else if (shape instanceof Square) {
                System.out.println(shape);
                Square square = (Square) shape;
                square.howToColor();
            }
        }
    }
}