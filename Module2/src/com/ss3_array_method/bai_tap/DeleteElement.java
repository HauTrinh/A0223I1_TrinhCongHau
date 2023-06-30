package com.ss3_array_method.bai_tap;

import java.util.Scanner;

import static java.lang.System.out;

public class DeleteElement {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        arr[5] = 6;
        int index = -1;
        Scanner sc = new Scanner(System.in);
        out.println("Mảng trước khi xóa là:");
        for (int j : arr) out.print(j + ", ");
        out.println();
        out.print("Nhập vào phần tử cần xóa: ");
        int x = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;
                break;
            }
        }
        deleteElement(x, index, arr);

    }

    public static void deleteElement(int x, int index, int[] arr) {
        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            out.println("Array after removing: " + x);
            for (int j = 0; j < arr.length - 1; j++) {
                out.print(arr[j] + ", ");
            }
        } else {
            out.println(x + " is not in the array.");
        }

    }
}
