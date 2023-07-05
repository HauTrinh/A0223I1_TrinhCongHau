package com.ss7_abstract_interface.bai_tap.codegym;

public class Square extends Shape implements Colorable{
    private double n = 1.0;


    public Square() {
    }

    public Square(double n) {
        this.n=n;
    }

    public Square(String color, boolean filled, double n) {
        super(color, filled);
        this.n = n;
    }
    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getArea() {
        return n*n;
    }

    public double getPerimeter() {
        return 2 * (n+n);
    }

    @Override
    public String toString() {
        return "A Square with n="
                + getN()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
