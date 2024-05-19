package org.example.brute_force.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 연세대학교_프로그래밍_경시대회_2017 {
}

class Main13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 2; i < n; i += 2) {
            for (int j = 1; j < n; j++) {
                for (int k = 3; k < n; k++) {
                    if (i + j + k == n && k - j >= 2) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
