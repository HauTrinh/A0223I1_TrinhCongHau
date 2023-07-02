package com.ss4_class_object.thu_hanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua hcn: ");
        double height = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap chieu rong cua hcn: ");
        double width = Double.parseDouble(sc.nextLine());

        Rectangle myRectangle = new Rectangle(height,width);
        System.out.println("HCN cua toi: \n" + myRectangle.display());
        System.out.println("Dien tich hcn: " + myRectangle.getArea());
        System.out.println("Chu vi hcn: " + myRectangle.getPerimeter());
    }
}
