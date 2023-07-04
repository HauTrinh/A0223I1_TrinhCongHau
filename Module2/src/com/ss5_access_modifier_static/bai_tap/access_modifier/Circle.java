package com.ss5_access_modifier_static.bai_tap.access_modifier;

public class Circle {
    private double radius;
    private String color;

    Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (this.radius * this.radius) * Math.PI;
    }
}
