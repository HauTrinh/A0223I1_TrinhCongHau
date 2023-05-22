package com.ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float height, width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = Float.parseFloat(sc.nextLine());//Nhập chiều rộng

        System.out.print("Enter height: ");
        height = Float.parseFloat(sc.nextLine());//Nhập chiều dài

        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
