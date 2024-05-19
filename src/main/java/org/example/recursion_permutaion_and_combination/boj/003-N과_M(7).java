package org.example.recursion_permutaion_and_combination.boj;

import java.util.Arrays;
import java.util.Scanner;

class N과_M_7 {
}

class Main3 {

    public static int[] numbers;
    public static int[] output;
    public static StringBuilder sb = new StringBuilder();

    public static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        sb.append("\n");
    }

    public static void permutation(int depth, int n, int m) {
        // base case
        if (depth == m) {
            print(output, m);
            return;
        }

        // recursive case
        for (int i = 0; i < n; i++) {
            output[depth] = numbers[i];
            permutation(depth + 1, n, m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        numbers = new int[n];
        output = new int[m];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        permutation(0, n, m);
        System.out.println(sb);
    }
}
