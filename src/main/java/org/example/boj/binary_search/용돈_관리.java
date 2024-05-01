package org.example.boj.binary_search;

import java.util.Scanner;

class 용돈_관리 {
}

class Main252 {

    static boolean isPossible(int[] useAmounts, int drawAmount, int maxDrawCount) {
        // 1일차에는 무조건 1번 출금해야 한다.
        int drawCount = 1;
        int currentAmount = drawAmount;
        for (int useAmount : useAmounts) {
            if (useAmount > drawAmount) return false;
            if (useAmount > currentAmount) {
                if (drawCount == maxDrawCount) return false;
                drawCount++;
                currentAmount = drawAmount;
            }
            currentAmount -= useAmount;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] useAmounts = new int[N];
        for (int i = 0; i < N; i++) {
            useAmounts[i] = sc.nextInt();
        }

        // 1. 한 번에 인출할 금액의 탐색 범위를 정한다.
        int l = 1;
        int r = 10000 * N;
        int ans = -1;
        while (l <= r) {
            // 2. 임의의 인출 금액에 대해
            //    2-1. 해당 금액으로 M번 이하로 출금할 수 있다면 인출액을 줄여본다.
            //    2-2. M번 이하로 출금하는게 불가능하다면 인출액을 늘려본다.
            int m = (l + r) / 2;
            if (isPossible(useAmounts, m, M)) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        // 3. 가능한 인출액 중 최소금액을 출력한다.
        System.out.println(ans);
    }
}
