package org.example.boj.prefix_sum;

import java.util.Scanner;

class 태상이의_훈련소_생활 {
}

class Main234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] origin = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            origin[i] = sc.nextInt();
        }

        // 1. 각 지시에 따른 변화량을 기록한다.
        int[] delta = new int[N + 2];
        while (M-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            delta[a] += k;
            delta[b + 1] -= k;
        }

        // 2. 각 칸부터의 변화량을 각 칸에 적용한다.
        int[] accDelta = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            accDelta[i] = accDelta[i - 1] + delta[i];
        }

        // 3. 변화량이 적용된 각 칸의 높이를 출력한다.
        for (int i = 1; i <= N; i++) {
            System.out.print(origin[i] + accDelta[i] + " ");
        }
        System.out.println();
    }
}
