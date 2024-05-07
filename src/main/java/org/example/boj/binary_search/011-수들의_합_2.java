package org.example.boj.binary_search;

import java.util.Scanner;

class 수들의_합_2 {
}

// Brute Force
class Main11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += arr[j];
                if (sum == M) {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}

// Binary Search + Prefix Sum
class Main11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        long[] acc = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            acc[i] = acc[i - 1] + arr[i];
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int l = i;
            int r = N;
            while (l <= r) {
                int m = (l + r) / 2;
                long sum = acc[m] - acc[i - 1];
                if (sum > M) r = m - 1;
                else if (sum < M) l = m + 1;
                else {
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}

// Two Pointer
class Main11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        int nextIndex = 0;
        int currentSum = 0;
        for (int i = 0; i < N; i++) {
            while (currentSum < M && nextIndex < N) {
                currentSum += arr[nextIndex++];
            }
            if (currentSum == M) {
                ans++;
            }
            currentSum -= arr[i];
        }

        System.out.println(ans);
    }
}
