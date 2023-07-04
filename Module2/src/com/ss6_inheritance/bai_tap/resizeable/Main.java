package com.ss6_inheritance.bai_tap.resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3.5, "indigo", false);
        shapes[1] = new Rectangle();

        for (Shape shape : shapes) {
            if (shape instanceof Circle) { // nếu shape là 1 đối tượng của Circle : nghĩa là new với Circle
                System.out.println(shape); // hiển thị toString của Circle.
                Circle circle = (Circle) shape; // ép kiểu shape về lại từ cha về con: Shape -> Circle : để gọi các phương thức trong Circle
                System.out.println("Diện tích trước khi tăng: " + circle.getArea());
                System.out.print("Diện tích sau khi tăng: ");
                circle.resize(20);
            } else if (shape instanceof Rectangle) {
                System.out.println(shape);
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Diện tích trước khi tăng: " + rectangle.getArea());
                System.out.print("Diện tích sau khi tăng: ");
                rectangle.resize(20);
            }
        }
    }
}
