package com.ss3_array_method.bai_tap;

import java.util.Scanner;

public class CharOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        System.out.print("Nhập ký tự: ");
        char ch = sc.next().charAt(0);

        int count = countOccurrences(str, ch);

        System.out.println("Số lần xuất hiện của ký tự " + ch + " trong chuỗi là: " + count);
    }

    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
