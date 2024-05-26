package org.example.recursion_backtracking.boj;

import java.util.Scanner;

class N_Queen {
}

class Main5 {

    public static int[] queen = new int[15];

    public static boolean isValid(int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queen[i] == col) return false;
            if (Math.abs(row - i) == Math.abs(col - queen[i])) return false;
        }
        return true;
    }

    public static int solve(int n, int row) {
        int count = 0;
        // base case
        if (row == n) return 1;

        // recursive case
        for (int col = 0; col < n; col++) {
            if (isValid(row, col)) {
                queen[row] = col;
                count += solve(n, row + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n, 0));
    }
}
