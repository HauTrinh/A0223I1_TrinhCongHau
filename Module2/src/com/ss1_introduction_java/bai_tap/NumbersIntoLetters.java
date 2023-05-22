package com.ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class NumbersIntoLetters {
    public static void main(String[] args) {
        System.out.print("Please enter the number you want to read: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if (number < 10) {
            System.out.printf("The number '%d' is read as %s", number, readSingleDigit(number));
        } else if (number < 20) {
            System.out.printf("The number '%d' is read as %s", number, readTwoDigitsLessThanTwenty(number));
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            System.out.println("The number " + number + " is read as " + readTens(tens) + " " + readSingleDigit(ones));
        } else {
            int hundreds = number / 100;
            int remainingDigits = number % 100;
            System.out.println("The number " + number + " is read as " + readSingleDigit(hundreds) + " hundred and " + readNumber(remainingDigits));
        }
    }

    public static String readSingleDigit(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String readTwoDigitsLessThanTwenty(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String readTens(int number) {
        switch (number) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }

    public static String readNumber(int number) {
        if (number < 10) {
            return readSingleDigit(number);
        } else if (number < 20) {
            return readTwoDigitsLessThanTwenty(number);
        } else {
            int tens = number / 10;
            int ones = number % 10;
            return readTens(tens) + " " + readSingleDigit(ones);
        }
    }
}





