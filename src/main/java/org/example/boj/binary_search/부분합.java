package org.example.boj.two_pointer;

import java.util.Scanner;

class 부분합 {
}


// Two Pointer
class Main259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int ansLength = N + 1;
        int rightIndex = 0;
        int currentSum = arr[0];

        for (int i = 0; i < N; i++) {
            while (currentSum < S && rightIndex < N - 1) {
                currentSum += arr[++rightIndex];
            }
            if (currentSum >= S) {
                ansLength = Math.min(ansLength, rightIndex - i + 1);
            }
            currentSum -= arr[i];
        }

        if (ansLength > N) ansLength = 0;
        System.out.println(ansLength);
    }
}

// Binary Search + Prefix Sum
class Main260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        long[] acc = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            acc[i] = acc[i - 1] + arr[i - 1];
        }

        int ansLength = N + 1;
        for (int i = 1; i <= N; i++) {
            int l = i;
            int r = N;
            while (l <= r) {
                int m = (l + r) / 2;
                long sum = acc[m] - acc[i - 1];
                if (sum >= S) {
                    ansLength = Math.min(ansLength, m - i + 1);
                    r = m - 1;
                } else l = m + 1;
            }
        }

        if (ansLength > N) ansLength = 0;
        System.out.println(ansLength);
    }
}
