package org.example.boj.sort;

import java.util.Scanner;

class 안테나 {
}

class Main229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] xs = new int[N];
        for (int i = 0; i < N; i++) {
            xs[i] = sc.nextInt();
        }

        // 가장 왼쪽에 안테나를 설치했을 때 거리 합을 구한다.
        int optimalAntenaX = xs[0];
        long optimalDistanceSum = 0;
        for (int i = 0; i < N; i++) {
            optimalDistanceSum += xs[i] - xs[0];
        }
    }
}

class Main228 {
    public static void main(String[] args) {
        
    }
}
