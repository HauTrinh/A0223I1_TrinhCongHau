package com.ss2_loop.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập số lượng số nguyên tố cần hiển thị: ");
            number = Integer.parseInt(sc.nextLine());

            if (number <= 0) {
                System.out.println("Số bạn nhập vào không hợp lệ (n > 0), Xin nhập lại!!!");
            }
        } while (number <= 0);
        int count = 0;
        int N = 2;
        while (count < number) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(" " + N);
                count++;
            }
            N++;
        }
    }
}
