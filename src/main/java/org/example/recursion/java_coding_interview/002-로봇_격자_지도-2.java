package org.example.recursion.java_coding_interview;

class 로봇_격자_지도_2 {
    // 일반 재귀 알고리즘
    public static int countPaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return -1;
        }

        // 첫 번째 열/행의 모든 칸으로 이동하면 1입니다.
        if (m == 1 || n == 1) {
            return 1;
        }

        return countPaths(m - 1, n) + countPaths(m, n - 1);
        // 대각선으로 이동 가능하면 앞 줄에 다음 코드를 추가: + numberOfPaths(m - 1, n - 1);
    }

    // 테뷸레이션
    public static int countPathsBottomUp(int m, int n) {
        if (m <= 1 || n <= 1) {
            return -1;
        }

        // 하위 문제의 결과를 저장(cache)
        int[][] count = new int[m][n];

        // 첫 번째 행의 모든 칸으로 이동하면 1입니다.
        for (int j = 0; j < n; j++) {
            count[0][j] = 1;
        }

        // 첫 번째 열의 모든 칸으로 이동하면 1입니다.
        for (int i = 0; i < m; i++) {
            count[i][0] = 1;
        }

        // 상향식 접근법으로 이동할 다른 칸의 경로 결정
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                count[i][j] = count[i - 1][j] + count[i][j - 1];
                // 대각선으로 이동 가능하면 앞 줄에 다음 코드를 추가: + count[i - 1][j - 1];
            }
        }

        return count[m - 1][n - 1];
    }
}

class Main2 {
    public static void main(String[] args) {
        // 6×6 격자
        int result1 = 로봇_격자_지도_2.countPaths(6, 6);
        int result2 = 로봇_격자_지도_2.countPathsBottomUp(6, 6);

        System.out.println("Number of unique paths via plain recursion: " + result1);
        System.out.println("Number of unique paths via Bottom Up: " + result2);
    }
}
