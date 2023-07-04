package com.ss6_inheritance.thuc_hanh.Shapes;

public class Shapes {
    private String color;
    private boolean filles;

    public  Shapes() {
    }

    public Shapes(String color, boolean filles) {
        this.color = color;
        this.filles = filles;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilles() {
        return filles;
    }

    public void setFilles(boolean filles) {
        this.filles = filles;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilles() ? "filled" : "not filled");
    }
}
