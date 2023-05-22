package com.ss2_loop.bai_tap;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the isosceles triangle");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    break;
            }
        } while (choice != 4);
    }

    public static void printRectangle() {
        System.out.print("Enter the height: ");
        Scanner sc = new Scanner(System.in);
        int height = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Enter the width: ");
        int width = Integer.parseInt(sc.nextLine());
        for (int i = 1; i < width; i++) {
            for (int j = 1; j < height; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printSquareTriangle() {
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Bottom left corner");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Top left corner");
        for (int i = size; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Button right corner");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < size - i - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("Top right corner");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printIsoscelesTriangle() {
        System.out.print("Enter the height: ");
        int height = Integer.parseInt(new Scanner(System.in).nextLine());

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

