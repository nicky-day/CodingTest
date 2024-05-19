package org.example.two_pointer.boj;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class 배열_합치기 {
}

class Main8 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[M];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            b[i] = sc.nextInt();
        }

        // A, B에 남은 원소 중 가장 작은값들만 비교하여
        // 더 작은값을 차례로 정답 배열에 채워나간다.
        int[] ans = new int[N + M];
        int indexA = 0;
        int indexB = 0;
        int indexAnswer = 0;
        while (indexA < N && indexB < M) {
            if (a[indexA] < b[indexB]) {
                ans[indexAnswer++] = a[indexA++];
            } else {
                ans[indexAnswer++] = b[indexB++];
            }
        }
        while (indexA < N) {
            ans[indexAnswer++] = a[indexA++];
        }
        while (indexB < M) {
            ans[indexAnswer++] = b[indexB++];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int x : ans) {
            bw.write(x + " ");
        }
        bw.flush();
    }
}

