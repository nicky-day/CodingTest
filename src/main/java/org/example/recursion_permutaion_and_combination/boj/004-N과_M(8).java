package org.example.recursion_permutaion_and_combination.boj;

import java.util.Arrays;
import java.util.Scanner;

class N과_M_8 {
}

class Main4 {
    public static StringBuilder sb = new StringBuilder();

    public static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }
        sb.append("\n");
    }

    public static void permutation(int[] numbers, int[] output, int depth, int n, int m, int start) {
        // base case
        if (depth == m) {
            print(output, m);
            return;
        }

        // recursive case
        for (int i = start; i < n; i++) {
            output[depth] = numbers[i];
            permutation(numbers, output, depth + 1, n, m, i);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        permutation(numbers, new int[m], 0, n, m, 0);
        System.out.println(sb);
    }
}
