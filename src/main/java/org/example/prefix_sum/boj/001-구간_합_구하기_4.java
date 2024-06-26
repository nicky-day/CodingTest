package org.example.prefix_sum.boj;

import java.util.Scanner;

class 구간_합_구하기_4 {
}

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] acc = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            acc[i] = acc[i - 1] + arr[i];
        }

        while (M-- > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(acc[j] - acc[i - 1]);
        }
    }
}
