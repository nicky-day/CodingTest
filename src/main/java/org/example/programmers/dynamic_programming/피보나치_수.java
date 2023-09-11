package org.example.programmers.dynamic_programming;

import java.util.Arrays;

class 피보나치_수 {
    private final int[] mem = new int[100001];
    private int fibonacci(int n) {
        if (mem[n] != -1) return mem[n];
        if (n == 0 || n == 1) return n;
        return mem[n] = (fibonacci(n - 1) + fibonacci(n  - 2)) % 1234567;
    }

    public int solution(int n) {
        Arrays.fill(mem, -1);
        for (int i = 0; i <= n; i++) {
            fibonacci(n);
        }
        return fibonacci(n);
    }
}

class Main141 {
    public static void main(String[] args) {
        피보나치_수 problem = new 피보나치_수();
        int n = 5;
        System.out.println(problem.solution(n));
    }
}
