package com.ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        System.out.print("Enter your name: " );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
