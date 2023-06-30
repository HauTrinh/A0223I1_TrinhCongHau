package com.ss3_array_method.bai_tap;

import java.util.Scanner;

public class SumOfColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        do {
            System.out.print("Nhập số hàng của ma trận: ");
            row = Integer.parseInt(sc.nextLine());

            if (row < 0) {
                System.out.println("Số bạn nhập vào không hợp lệ (n >= 0), Xin nhập lại!!!");
            }
        } while (row < 0);

        int col;
        do {
            System.out.print("Nhập số cột của ma trận: ");
            col = Integer.parseInt(sc.nextLine());

            if (col < 0) {
                System.out.println("Số bạn nhập vào không hợp lệ (n >= 0), Xin nhập lại!!!");
            }
        } while (col < 0);

        int[][] matrix = new int[row][col];

        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int colum;
        do {
            System.out.print("Nhập số cột cần tính tổng của ma trận: ");
            colum = Integer.parseInt(sc.nextLine());

            if (colum < 0) {
                System.out.println("Số bạn nhập vào không hợp lệ (n >= 0), Xin nhập lại!!!");
            }
        } while (colum < 0);
       sumOfColum(matrix,colum);
    }
    public static void sumOfColum(int[][] matrix, int colum) {
        System.out.println("Ma trận đã nhập: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
           sum += matrix[row][colum];
            }
        System.out.println("Tổng 1 cột của ma trận cần tìm là: " +sum);
        }

    }
