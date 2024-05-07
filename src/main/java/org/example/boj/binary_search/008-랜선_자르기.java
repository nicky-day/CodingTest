package org.example.boj.binary_search;

import java.util.Scanner;

class 랜선_자르기 {
}

class Main8 {

    static long calculateCount(int[] len, long m) {
        long count = 0;
        for (int l : len) {
            count += l / m;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] len = new int[K];
        for (int i = 0; i < K; i++) {
            len[i] = sc.nextInt();
        }

        // 1. 만들어볼 랜선 길이의 탐색 범위를 정한다.
        long l = 1;
        long r = (1 << 31) - 1;
        long ans = -1;
        while (l <= r) {
            // 2. 임의의 랜선 길이에 대해
            //    2-1. 해당 길이의 랜선을 N개 이상 만들 수 있다면 길이를 늘려본다.
            //    2-2. N개 이상 만들 수 없다면 길이를 줄여본다.`
            long m = (l + r) / 2;
            if (calculateCount(len, m) >= N) {
                l = m + 1;
                ans = m;
            } else {
                r = m - 1;
            }

        }
        // 3. N개 이상 만들 수 있었던 길이 중 최댓값을 출력한다.
        System.out.println(ans);
    }
}
