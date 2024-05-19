package org.example.brute_force.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 사탕_게임 {

    public int calcScore(char[][] map) {
        int N = map.length;
        int maxScore = 0;
        // 가장 긴 연속 column 찾기
        for (int r = 0; r < N; r++) {
            int score = 1;
            for (int c = 1; c < N; c++) {
                if (map[r][c] == map[r][c - 1]) {
                    score++;
                } else {
                    maxScore = Math.max(maxScore, score);
                    score = 1;
                }
            }
            maxScore = Math.max(maxScore, score);
        }
        // 가장 긴 연속 row 찾기
        for (int c = 0; c < N; c++) {
            int score = 1;
            for (int r = 1; r < N; r++) {
                if (map[r][c] == map[r - 1][c]) {
                    score++;
                } else {
                    maxScore = Math.max(maxScore, score);
                    score = 1;
                }
            }
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }

    public void swapCandy(char[][] board, int x1, int y1, int x2, int y2) {
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

}

class Main29 {
    public static void main(String[] args) throws IOException {
        사탕_게임 problem = new 사탕_게임();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] board = new char[N][N];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // swap right
                if (j + 1 < N) {
                    problem.swapCandy(board, i, j, i, j + 1);
                    ans = Math.max(ans, problem.calcScore(board));
                    problem.swapCandy(board, i, j, i, j + 1);
                }
                // swap below
                if (i + 1 < N) {
                    problem.swapCandy(board, i, j, i + 1, j);
                    ans = Math.max(ans, problem.calcScore(board));
                    problem.swapCandy(board, i, j, i + 1, j);
                }
            }
        }
        System.out.println(ans);
    }
}
