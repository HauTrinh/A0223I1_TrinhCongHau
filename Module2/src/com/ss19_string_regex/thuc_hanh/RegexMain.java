package com.ss19_string_regex.thuc_hanh;

import java.util.regex.Pattern;

public class RegexMain {
    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public void validateEmai (String email) {
        boolean isValidEmail = Pattern.matches(EMAIL_REGEX, email);

        if (isValidEmail) {
            System.out.println("Email hợp lệ.");
        } else {
            System.out.println("Email không hợp lệ.");
    }

    }
}
