package com.ss2_loop.bai_tap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

            System.out.print("Enter the height: ");
            int height = new Scanner(System.in).nextInt();

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < height - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        System.out.println();
    }
}

