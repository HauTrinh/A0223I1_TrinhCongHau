package com.ss6_inheritance.bai_tap.point_moveablepoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed, ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void getSpeed() {
        float[] speed = new float[2];
        speed[0] = xSpeed;
        speed[1] = ySpeed;
        System.out.println(Arrays.toString(speed));
    }

    @Override
    public String toString() {
        return "Moveable_Point{" + "(" + x + "," + y + ")" + "," + "speed= " + "(" + xSpeed + "," + ySpeed + ")";
    }

    public void move() {
        x += xSpeed;
        y += ySpeed;
        System.out.println(x + " - " + y);
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1, 1, 2, 3);
        System.out.println(moveablePoint);
    }
}
