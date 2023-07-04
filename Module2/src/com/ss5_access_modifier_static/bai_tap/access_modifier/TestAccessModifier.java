package com.ss5_access_modifier_static.bai_tap.access_modifier;

public class TestAccessModifier {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("Circle with radius: "+circle.getRadius()+" and area: " + circle.getArea());

        Circle circle1 = new Circle(25);
        System.out.println("Circle with radius: "+circle1.getRadius()+" and area: " + circle1.getArea());
    }
}
