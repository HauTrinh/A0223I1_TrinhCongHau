package com.ss19_string_regex.thuc_hanh;

import java.util.Scanner;

public class TestEmail {
    private static RegexMain regexMain = new RegexMain();
    ;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        for (String email : validEmail) {
            System.out.print(email + ": ");
            regexMain.validateEmai(email);
        }
        for (String email : invalidEmail) {
            System.out.print(email + ": ");
            regexMain.validateEmai(email);

        }
    }
}
