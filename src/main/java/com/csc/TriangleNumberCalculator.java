package com.csc;

public class TriangleNumberCalculator {

    // Method to compute the nth triangular number using recursion
    public int value(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        return triangular(n);
    }

    // Helper recursive method to calculate triangular numbers
    private int triangular(int n) {
        if (n == 1) {
            return 1;
        }
        return n + triangular(n - 1);
    }

    // Method to add the nth and mth triangular numbers
    public int add(int n, int m) {
        return value(n) + value(m);
    }

    // Method to subtract the nth and mth triangular numbers
    public int subtract(int n, int m) {
        return value(n) - value(m);
    }
}
