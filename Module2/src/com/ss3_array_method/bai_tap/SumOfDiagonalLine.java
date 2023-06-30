package com.ss3_array_method.bai_tap;

import java.util.Scanner;

public class SumOfDiagonalLine {
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

    sumOfColum(matrix);
}
    public static void sumOfColum(int[][] matrix) {
        System.out.println("Ma trận đã nhập: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int colum = 0;
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][colum];
            colum++;
        }
        System.out.println("Tổng 1 cột của ma trận cần tìm là: " +sum);
    }

}