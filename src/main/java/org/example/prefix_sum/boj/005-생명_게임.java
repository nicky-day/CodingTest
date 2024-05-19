package org.example.prefix_sum.boj;

import java.util.Scanner;

class 생명_게임 {
}

class Main5 {

    static int[][] getPrefixSum(char[][] map) {
        int[][] acc = new int[map.length][map[0].length];
        for (int i = 1; i < map.length; i++)
            for (int j = 1; j < map[0].length; j++)
                acc[i][j] = acc[i - 1][j] + acc[i][j - 1] - acc[i - 1][j - 1] + (map[i][j] == '*' ? 1 : 0);
        return acc;
    }

    static int getRangeSum(int[][] acc, int r, int c, int K) {
        int r1 = Math.max(r - K, 1);
        int c1 = Math.max(c - K, 1);
        int r2 = Math.min(r + K, acc.length - 1);
        int c2 = Math.min(c + K, acc[0].length - 1);
        return acc[r2][c2] - acc[r1 - 1][c2] - acc[r2][c1 - 1] + acc[r1 - 1][c1 - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        char[][] map = new char[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String rowMap = sc.next();
            for (int j = 1; j <= M; j++) {
                map[i][j] = rowMap.charAt(j - 1);
            }
        }

        // T시간 동안 각 칸은 시간마다 아래 상황을 반복한다.
        // 1. 생존 : 현재 칸에 생명이 있고, a <= 주위생명 <= b 라면 헤딩 칸의 생명은 생존한다.
        // 2. 고독 : 현재 칸에 생명이 있고, 주위생명 < a 라면 해당 칸의 생명은 외로워서 죽는다.
        // 3. 과밀 : 해당 칸에 생명이 있고, b < 주위생명 라면 해당 칸의 생명은 과밀로 죽는다.
        // 4. 번식 : 현재 칸에 생명이 없고, a < 주위생명 <= b 라면 해당 칸에 생명이 생긴다.

        while (T-- > 0) {
            int[][] acc = getPrefixSum(map);
            for (int i = 1; i <= N; i++)
                for (int j = 1; j <= M; j++) {
                    int nearAlive = getRangeSum(acc, i, j, K);
                    if (map[i][j] == '*') {
                        nearAlive--;
                        if (nearAlive < A || B < nearAlive)
                            map[i][j] = '.';
                    }
                    else if (A < nearAlive && nearAlive <= B)
                        map[i][j] = '*';
                }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
