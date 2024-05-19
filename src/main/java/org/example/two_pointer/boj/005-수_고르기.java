package org.example.two_pointer.boj;

import java.util.Arrays;
import java.util.Scanner;

class 수_고르기 {
}

// Two Pointer
class Main5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // Ai 증가하는 방향으로 이동하면
        // 차가 M 이상이 되는 쌍이 되는 Aj의 경계도 증가하는 방향으로 이동한다.
        int rightIndex = 0;
        int ansDiff = arr[N - 1] - arr[0];
        for (int i = 0; i < N; i++) {
            while (arr[rightIndex] - arr[i] < M && rightIndex < N - 1)
                rightIndex++;

            int diff = arr[rightIndex] - arr[i];
            if (diff >= M) ansDiff = Math.min(ansDiff, diff);
        }

        System.out.println(ansDiff);
    }
}

// Binary Search
class Main5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int ansDiff = arr[N - 1] - arr[0];
        for (int i = 0; i < N; i++) {
            int l = i;
            int r = N - 1;
            while (l <= r) {
                int m = (l + r) / 2;
                int diff = arr[m] - arr[i];
                if (diff >= M) {
                    ansDiff = Math.min(ansDiff, diff);
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }

        System.out.println(ansDiff);
    }
}
