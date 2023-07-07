package com.ss19_string_regex.bai_tap.validate_class;

import java.util.regex.Pattern;

public class RegexClass {
    private static final String CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM][0-9]$";

    public void validateClass(String classes) {
        boolean isValidClass = Pattern.matches(CLASS_REGEX, classes);

        if (isValidClass) {
            System.out.println("Tên lớp hợp lệ.");
        } else {
            System.out.println("Tên lớp không hợp lệ.");
        }
    }
}
