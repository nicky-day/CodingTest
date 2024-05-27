package org.example.divide_and_conquer.boj;

import java.util.Scanner;

class 곱셈 {
}

class Main1 {

    public static int a;
    public static int b;
    public static int c;

    public static long power(long a, long b) {
        if (b == 1) {
            return a % c;
        }
        long half = power(a, b / 2);
        if (b % 2 == 0) {
            return (half * half) % c;
        } else {
            return ((half * half) % c * a) % c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(power(a, b));
    }
}
