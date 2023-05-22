package com.ss2_loop.bai_tap;

public class LessThan100 {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        while (N < 100) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(" " + N);
            }
            N++;
        }
    }

}
