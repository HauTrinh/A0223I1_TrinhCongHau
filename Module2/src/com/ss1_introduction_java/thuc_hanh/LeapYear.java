package com.ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        12: năm nhuận
//        13: năm không nhuận
//        1000: năm không nhuận
//        2000: năm nhuận
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = Integer.parseInt(scanner.nextLine());
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}