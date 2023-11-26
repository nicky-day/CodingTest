package org.example.boj.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 연세대학교_프로그래밍_경시대회_2018 {
}

class Main190 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = 1;
        while (true) {
            if ((1 + k + (k * k)) == n) {
                System.out.println(k);
                break;
            }
            k++;
        }
    }
}
