package org.example.recursion_permutaion_and_combination.boj;

import java.util.Arrays;
import java.util.Scanner;

class N과_M_6 {
}

class Main2 {

    public static int[] numbers;
    public static int[] output;
    public static boolean[] check;

    public static void print(int[] arr, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }

    public static void permutation(int depth, int n, int m, int start) {
        if (depth == m) {
            print(output, m);
            return;
        }
        for (int i = start; i < n; i++) {
            if (!check[i]) {
                check[i] = true;
                output[depth] = numbers[i];
                permutation(depth + 1, n, m, i + 1);
                check[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        numbers = new int[n];
        output = new int[m];
        check = new boolean[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        permutation(0, n, m, 0);
    }
}
