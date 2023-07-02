package com.ss4_class_object.bai_tap.Quadra;

import java.util.Scanner;

public class MainQuadra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a,b,c:");
        System.out.print("a = ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("b = ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("c = ");
        double c = Double.parseDouble(sc.nextLine());

        QuadraticEquation myQuadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Phuong trinh bac 2 co nghiem la: \n" +"x1 = "+ myQuadraticEquation.getRoot1() +"\n x2 = " + myQuadraticEquation.getRoot2());

    }
}
