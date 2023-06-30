package com.ss3_array_method.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mảng trước khi xóa là:");
        for (int j : arr) System.out.print(j + ", ");
        System.out.println();
        System.out.print("Nhập vào vị trí cần thêm: ");
        int index = Integer.parseInt(sc.nextLine());
        System.out.println();
        System.out.print("Nhập vào phần tử cần thêm: ");
        int x = Integer.parseInt(sc.nextLine());
        addElement(x, index, arr);
    }

    public static void addElement(int x, int index, int[] arr) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Không chèn được phần tử vào mảng.");
            return;
        }

        int[] newArr = new int[arr.length + 1]; // Tạo một mảng mới lớn hơn mảng ban đầu

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = x; // Chèn phần tử mới vào vị trí index
            } else {
                newArr[i] = arr[j]; // Sao chép các phần tử từ mảng ban đầu
                j++;
            }
        }

        System.out.println("Mảng sau khi thêm phần tử:");
        for (int j : newArr) System.out.print(j + ", ");
    }
}
