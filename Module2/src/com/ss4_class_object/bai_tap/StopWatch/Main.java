package com.ss4_class_object.bai_tap.StopWatch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        StopWatch stopwatch = new StopWatch();
        selectionSort(array);
        stopwatch.stop();

        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Thời gian thực thi: " + elapsedTime + " mili giây");
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}