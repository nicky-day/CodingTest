package org.example.recursion.boj;

import java.util.Scanner;

class 피보나치_수 {
}

class Main1 {

    static int[] cache = new int[50];

    static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        if (cache[n] != 0) return cache[n];

        cache[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return cache[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
