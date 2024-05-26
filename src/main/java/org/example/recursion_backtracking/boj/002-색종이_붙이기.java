package org.example.recursion_backtracking.boj;

import java.util.Scanner;

class 색종이_붙이기 {
}

class Main1 {

    public static int[] paper = {0, 5, 5, 5, 5, 5};
    public static int[][] board = new int[10][10];
    public static int result = 26;
    public static int nextRow = 0;
    public static int nextCol = 0;

    public static void findNext(int row, int col) {
        for (int r = row; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                if (board[r][c] == 1) {
                    nextRow = r;
                    nextCol = c;
                    return;
                }
            }
        }
        nextRow = -1;
        nextCol = -1;
    }

    public static boolean isValid(int row, int col, int size) {
        if (row + size > 10 || col + size > 10) return false;
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (board[row + r][col + c] == 0) return false;
            }
        }
        return true;
    }

    public static void fill(int row, int col, int size, int color) {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                board[row + r][col + c] = color;
            }
        }
    }

    public static void solve(int row, int col, int cnt) {
        // base case
        // backtrack 1 : 현재 붙인 색종이 수가 탐색해 본 최솟값보다 큰 경우
        if (result <= cnt) return;
        findNext(row, col);
        if (nextRow == -1 && nextCol == -1) {
            result = cnt;
            return;
        }

        // recursive case
        int r = nextRow;
        int c = nextCol;
        for (int size = 1; size <= 5; size++) {
            // backtrack 2 : 색종이를 다 쓴 경우
            if (paper[size] == 0) continue;
            // backtrack 3 : 색종이를 붙이기에 공간이 좁은 경우
            if (!isValid(r, c, size)) continue;
            paper[size]--;
            fill(r, c, size, 0);
            solve(r, c, cnt + 1);
            fill(r, c, size, 1);
            paper[size]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        solve(0, 0, 0);
        System.out.println(result == 26 ? -1 : result);
    }
}
