package org.example.recursion_permutaion_and_combination.boj;

import java.util.Arrays;
import java.util.Scanner;

class N과_M_5 {
}

class Main1 {

    public static int[] numbers;
    public static int[] output;
    public static boolean[] check;

    public static int n;
    public static int m;

    public static void permutation(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                check[i] = true;
                output[depth] = numbers[i];
                permutation(depth + 1);
                check[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        numbers = new int[n];
        output = new int[m];
        check = new boolean[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        // 순열 생성 코드
        permutation(0);
    }
}
