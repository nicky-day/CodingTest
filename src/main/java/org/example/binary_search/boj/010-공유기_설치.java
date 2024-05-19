package org.example.binary_search.boj;

import java.util.Arrays;
import java.util.Scanner;

class 공유기_설치 {
}

class Main10 {

    static int calculateCount(int[] xs, int m) {
        int pastX = xs[0];
        int cnt = 1;
        for (int i = 1; i < xs.length; i++) {
            if (xs[i] - pastX >= m) {
                cnt++;
                pastX = xs[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] xs = new int[N];
        for (int i = 0; i < N; i++) {
            xs[i] = sc.nextInt();
        }

        Arrays.sort(xs);

        // 1. 공유기 사이의 거리 탐색 범위를 정한다.
        int l = 1;
        int r = xs[N - 1] - xs[0];
        int ans = -1;

        while (l <= r) {
            // 2. 인접한 공유기 사이의 거리에 대해
            //    2-1. 해당 거리를 지키면서 모든 공유기를 설치할 수 있다면 공유기 사이 거리를 늘려본다.
            //    2-2. 모든 공유기를 설치하는게 불가능하다면 공유기 사이 거리를 줄여본다.
            int m = (l + r) / 2;
            if (calculateCount(xs, m) >= C) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        // 3. 가능한 공유기 사이의 최대 거리를 출력한다.
        System.out.println(ans);
    }
}
