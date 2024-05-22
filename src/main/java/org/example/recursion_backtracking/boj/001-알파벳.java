package org.example.recursion_backtracking.boj;

import java.util.Scanner;

class 알파벳 {
}

class Main1_1 {

    public static int[][] board;
    public static boolean[] check = new boolean[26];
    public static int r;
    public static int c;
    public static int[] dr = {-1, 0, 1, 0};
    public static int[] dc = {0, 1, 0, -1};

    public static boolean isOutOfBound(int row, int col, int r, int c) {
        return row < 0 || row >= r || col < 0 || col >= c;
    }

    public static int solve(int row, int col) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int nr = row + dr[i];
            int nc = col + dc[i];
            if (isOutOfBound(nr, nc, r, c)) continue;
            int next = board[nr][nc];
            if (check[next]) continue;

            check[next] = true;
            result = Math.max(result, solve(nr, nc));
            check[next] = false;
        }
        return result + 1;     // 현재 위치 포함
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        board = new int[r][c];
        for (int i = 0; i < r; i++) {
            String line = sc.next();
            for (int j = 0; j < c; j++) {
                board[i][j] = line.charAt(j) - 'A';
            }
        }
        check[board[0][0]] = true;
        System.out.println(solve(0, 0));
    }
}
