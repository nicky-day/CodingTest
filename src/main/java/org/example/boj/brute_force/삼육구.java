package org.example.boj.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 삼육구 {
}

class Main195 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int claps = 0;
        for (int i = 1; i <= n; i++) {
            String num = String.valueOf(i);
            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) == '3' || num.charAt(j) == '6' || num.charAt(j) == '9') {
                    claps++;
                }
            }
        }
        System.out.println(claps);
    }
}
