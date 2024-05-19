package org.example.binary_search.boj;

import java.util.Scanner;

class 나무_자르기 {
}

class Main7 {

    static boolean isPossible(int[] heights, int cutHeight, int thresholdHeight) {
        long sum = 0;
        for (int h : heights) {
            if (h > cutHeight) sum += h - cutHeight;
        }
        return sum >= thresholdHeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        // 1. 절단기 높이의 탐색 범위를 정한다.
        int l = 0;
        int r = 1000000000;
        int ans = -1;
        while (l <= r) {
            // 2. 임의의 절단기 높이에 대해
            //    2-1. 원하는 만큼 나무를 가져갈 수 있다면 높이를 높여본다.
            //    2-2. 원하는 만큼 나무를 가져갈 수 없다면 높이를 낮춰본다.
            int m = (l + r) / 2;
            if (isPossible(h, m, M)) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        // 3. 원하는만큼 가져갈 수 있었던 높이 중 최대값을 출력한다.
        System.out.println(ans);
    }
}
