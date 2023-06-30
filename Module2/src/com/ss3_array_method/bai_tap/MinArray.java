package com.ss3_array_method.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinArray {
    public static <arr> void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        do {
            System.out.print("Nhập vào kích thước của mảng: ");
            size = Integer.parseInt(sc.nextLine());

            if (size <= 0) {
                System.out.println("Số bạn nhập vào không hợp lệ (n > 0), Xin nhập lại!!!");
            }
        } while (size <= 0);

        int[] arr = inputArray(size);

        System.out.println("Mảng đã nhập:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        minArray(arr);
    }

    public static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] =  Integer.parseInt(sc.nextLine());
        }
        return arr;
    }
    public static  void minArray (int[] arr) {
       int  min = arr[0];
       for (int i = 0; i < arr.length; i++) {
           if (min > arr[i]) {
               min = arr[i];
           }
       }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
    }
}

