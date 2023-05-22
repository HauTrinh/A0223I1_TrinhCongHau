package com.ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Mời bạn nhập vào số tiền USD: ");
            usd = Double.parseDouble(sc.nextLine());

            if (usd <= 0) {
                System.out.println("Số tiền bạn nhập vào không hợp lệ (n > 0), Xin nhập lại!!!");
            }
        } while (usd <= 0);
        System.out.printf("Số tiền %f được quy đổi thành %f", usd, (usd * vnd));
    }
}
