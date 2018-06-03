package com.juhnowski.q14;

import static java.lang.Math.sqrt;

public class TestException {
    public static void main(String[] args) {
        System.out.println(f(0));
    }

    private static double f(double x) {
        try {
            if (x <= 0) {
                throw new IllegalArgumentException("Ooops");
            }
            return sqrt(x);
        } catch (IllegalArgumentException e) {
            return 0;
        } finally {
            return -1;
        }
    }
}
