package com.ss19_string_regex.bai_tap.validate_class;

import java.util.Scanner;

public class TestClass {
    private static RegexClass regexClass = new RegexClass();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên lớp học: ");
        String classes = sc.nextLine();
        regexClass.validateClass(classes);
    }
}
