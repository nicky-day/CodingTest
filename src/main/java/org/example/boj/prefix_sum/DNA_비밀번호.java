package org.example.boj.prefix_sum;

import java.util.Scanner;

class DNA_비밀번호 {
}

// Two Pointer
class Main263 {

    static int baseToIndex(char alp) {
        if (alp == 'A') return 0;
        else if (alp == 'C') return 1;
        else if (alp == 'G') return 2;
        else if (alp == 'T') return 3;
        return -1;
    }

    static boolean isValid(int[] count, int[] mininumBaseCount) {
        for (int i = 0; i < 4; i++) {
            if (count[i] < mininumBaseCount[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();
        char[] sequence = sc.next().toCharArray();
        int[] mininumBaseCount = new int[4];
        for (int i = 0; i < 4; i++) {
            mininumBaseCount[i] = sc.nextInt();
        }

        int[] count = new int[4];
        for (int i = 0; i < P - 1; i++) {
            count[baseToIndex(sequence[i])]++;
        }
        int ans = 0;

        // 모든 경우의 수 탐색
        for (int i = P - 1; i < S; i++) {
            // 이번 윈도우의 끝 값을 추가
            count[baseToIndex(sequence[i])]++;
            if (isValid(count, mininumBaseCount)) ans++;

            // 이번 윈도우의 첫 값을 제거
            count[baseToIndex(sequence[i - P + 1])]--;
        }

        System.out.println(ans);

    }
}

// Brute Force + Prefix Sum
class Main264 {

    static int baseToIndex(char alp) {
        if (alp == 'A') return 0;
        else if (alp == 'C') return 1;
        else if (alp == 'G') return 2;
        else if (alp == 'T') return 3;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();
        char[] sequence = sc.next().toCharArray();
        int[] mininumBaseCount = new int[4];
        for (int i = 0; i < 4; i++) {
            mininumBaseCount[i] = sc.nextInt();
        }

        int[][] accCount = new int[S + 1][4];
        for (int i = 1; i <= S; i++) {
            for (int j = 0; j < 4; j++) {
                accCount[i][j] = accCount[i - 1][j];
            }
            accCount[i][baseToIndex(sequence[i - 1])]++;
        }

        int ans = 0;
        for (int l = 1; l <= S - P + 1; l++) {
            boolean isValid = true;
            for (int i = 0; i < 4; i++) {
                int count = accCount[l + P - 1][i] - accCount[l - 1][i];
                if (count < mininumBaseCount[i])
                    isValid = false;
            }
            if (isValid) ans++;
        }

        System.out.println(ans);
    }
}
