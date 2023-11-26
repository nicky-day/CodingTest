package org.example.boj.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 지각 {
}

class Main188 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int d = Integer.parseInt(br.readLine());
            int max = 0;
            for (int t = 0; t <= Math.sqrt(d); t++) {
                if (d - ((t * t) + t) >= 0) {
                    max = t;
                }
            }
            System.out.println(max);
        }
    }
}
