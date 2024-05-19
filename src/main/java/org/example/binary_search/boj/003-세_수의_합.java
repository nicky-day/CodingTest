package org.example.binary_search.boj;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class 세_수의_합 {
}

class Main3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // A + B + C = X -> A + B = X - C
        // 1. A + B의 집합을 만든다.
        Set<Integer> sums = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sums.add(arr[i] + arr[j]);
            }
        }

        // 2. 모든 X - C에 대해 A + B의 집합에 존재하는지 확인한다.
        int ans = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                int target = arr[i] - arr[j];   // X - C
                if (sums.contains(target)) {
                    ans = Math.max(ans, arr[i]);
                }
            }
        }

        // 3. A + B = X - C을 만족하는 X 중 최대값을 출력한다.
        System.out.println(ans);
    }
}

class Main3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // A + B + C = X -> A + B = X - C
        // 1. A + B의 집합을 만든다.
        int[] sums = new int[N * (N + 1) / 2];
        int sumsIndex = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sums[sumsIndex++] = arr[i] + arr[j];
            }
        }

        Arrays.sort(sums);

        // 2. 모든 X - C에 대해 A + B의 집합에 존재하는지 확인한다.
        int ans = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                int target = arr[i] - arr[j];   // X - C
                if (Arrays.binarySearch(sums, target) >= 0) {
                    ans = Math.max(ans, arr[i]);
                }
            }
        }
        System.out.println(ans);
    }
}

class Main3_3 {

    static boolean isExist(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] < x) l = m + 1;
            else if (arr[m] > x) r = m - 1;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // A + B + C = X -> A + B = X - C
        // 1. A + B의 집합을 만든다.
        int[] sums = new int[N * (N + 1) / 2];
        int sumsIndex = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sums[sumsIndex++] = arr[i] + arr[j];
            }
        }

        Arrays.sort(sums);

        // 2. 모든 X - C에 대해 A + B의 집합에 존재하는지 확인한다.
        int ans = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                int target = arr[i] - arr[j];   // X - C
                if (isExist(sums, target)) {
                    ans = Math.max(ans, arr[i]);
                }
            }
        }
        System.out.println(ans);
    }
}
