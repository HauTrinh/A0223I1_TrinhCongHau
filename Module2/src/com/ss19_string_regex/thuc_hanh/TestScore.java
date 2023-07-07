package com.ss19_string_regex.thuc_hanh;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String score =sc.nextLine();

        boolean isValid = Pattern.matches("^[0-9](\\.[0-9])?$|^10(\\.0)?$", score);

        if (isValid) {
            System.out.println("Số điểm hợp lệ.");
        } else {
            System.out.println("Số điểm không hợp lệ.");
        }
    }
}
