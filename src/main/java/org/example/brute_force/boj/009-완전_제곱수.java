package org.example.brute_force.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 완전_제곱수 {
}

class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 0;
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500; j++) {
                if (Math.pow(i, 2) == Math.pow(j, 2) + n) {
                    total += 1;
                }
            }
        }
        System.out.println(total);
    }
}
