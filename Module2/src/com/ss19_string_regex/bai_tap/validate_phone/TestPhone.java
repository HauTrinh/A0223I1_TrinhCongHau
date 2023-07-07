package com.ss19_string_regex.bai_tap.validate_phone;

import com.ss19_string_regex.bai_tap.validate_class.RegexClass;

import java.util.Scanner;

public class TestPhone {
    private static RegexPhone regexPhone = new RegexPhone();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        regexPhone.validatePhoneNumber(phoneNumber);
    }
}
