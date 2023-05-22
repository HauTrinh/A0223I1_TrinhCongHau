package com.ss1_introduction_java.thuc_hanh;

import java.util.Date;

public class SystemTime {
    public static void main(String[] args) {
        Date now = new Date(); // Lấy ra thời gian hiện tại
        long startTime = System.currentTimeMillis();   // Lấy thời gian hiện tại quy đổi ra giây

        System.out.println("Now is: " + now);
        System.out.println("Time is milis: " + startTime);
    }
}