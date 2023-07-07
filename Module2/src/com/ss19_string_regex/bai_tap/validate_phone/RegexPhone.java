package com.ss19_string_regex.bai_tap.validate_phone;

import java.util.regex.Pattern;

public class RegexPhone {
    private static final String PHONE_REGEX = "^\\d{10}$";
    // ^\\(\\d{2}\\)-\\(0\\d{9}\\)$ VD: (84)-(0978489648)

    public void validatePhoneNumber(String phone) {
        boolean isValidPhone = Pattern.matches(PHONE_REGEX, phone);

        if (isValidPhone) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }
}
