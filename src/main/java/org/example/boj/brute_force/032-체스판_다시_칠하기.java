package org.example.boj.brute_force;

import java.util.Scanner;

import static org.example.boj.brute_force.체스판_다시_칠하기.countDifferent;

class 체스판_다시_칠하기 {
    // 8x8 체스판을 2x2로 나누어서 검은색과 흰색으로 나누어서
    // 각각의 경우에 대해서 최소값을 구한다.
    // 2x2로 나누어서 검은색과 흰색으로 나누는 경우는 2가지이다.
    // 1. 검은색이 왼쪽 위에 있는 경우
    // 2. 흰색이 왼쪽 위에 있는 경우
    // 이렇게 2가지 경우에 대해서 최소값을 구하면 된다.
    public static int countDifferent(char[][] board, int startRow, int startColumn, String pattern) {
        int cnt = 0;
        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startColumn; j < startColumn + 8; j++) {
                if (board[i][j] != pattern.charAt((i + j) % 2)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

class Main32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = sc.next().toCharArray();
        }

        int ans = N * M;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int countBW = countDifferent(board, i, j, "BW");
                int countWB = countDifferent(board, i, j, "WB");
                ans = Math.min(ans, Math.min(countBW, countWB));
            }
        }
        System.out.println(ans);
    }
}
