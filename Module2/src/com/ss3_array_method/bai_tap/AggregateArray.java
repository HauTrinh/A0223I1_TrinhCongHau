package com.ss3_array_method.bai_tap;

import java.util.Scanner;

public class AggregateArray {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[4];
        inputArray(arr1, "thứ nhất");
        inputArray(arr2, "thứ hai");
        showArray(arr1, arr2);
        aggregate(arr1, arr2);
    }

    public static void inputArray(int[] arr, String ordinal) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng " + ordinal + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
    }

    public static void showArray(int[] arr1, int[] arr2) {
        System.out.println("Mảng thứ nhất: ");
        for (int i : arr1) System.out.print(i + " ");
        System.out.println();
        System.out.println("Mảng thứ hai: ");
        for (int j : arr2) System.out.print(j + " ");
        System.out.println();
    }

    public static void aggregate(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0, j = 0; i < arr1.length; i++) {
            newArr[i] = arr1[j];
            j++;
        }
        for (int i = arr2.length + 1, j = 0; i < newArr.length; i++) {
            newArr[i] = arr2[j];
            j++;
        }
        System.out.println("Mảng sau khi gộp: ");
        for (int i : newArr) System.out.print(i + " ");
    }
}
