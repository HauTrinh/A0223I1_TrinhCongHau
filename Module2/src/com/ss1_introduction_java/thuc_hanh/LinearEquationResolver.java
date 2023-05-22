package com.ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = Double.parseDouble(sc.nextLine());

        System.out.print("b = ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.print("c = ");
        double c = Double.parseDouble(sc.nextLine());

        if (a != 0) {
            System.out.printf("Equation pass with x = %f!\n", ((c - b) / a));
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }

    }
}
