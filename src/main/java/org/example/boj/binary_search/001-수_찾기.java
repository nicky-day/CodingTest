package org.example.boj.binary_search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class 수_찾기 {
}

class Main1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }
        int M = sc.nextInt();
        while (M-- > 0) {
            int x = sc.nextInt();
            System.out.println(set.contains(x) ? 1 : 0);
        }
    }
}

class Main1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int M = sc.nextInt();
        while (M-- > 0) {
            int x = sc.nextInt();
            System.out.println(Arrays.binarySearch(arr, x) >= 0 ? 1 : 0);
        }
    }
}
