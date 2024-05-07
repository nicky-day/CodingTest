package org.example.boj.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 루트 {
}

class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] input = br.readLine().split(" ");
            int b = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            if (b == 0 && n == 0) return;

            int close = 0;
            for (int i = 1; i <= 1000000; i++) {
                double diffA = Math.abs(Math.pow(i, n) - b);
                double diffB = Math.abs(Math.pow(close, n) - b);
                double diffC = Math.abs(Math.pow(i + 1, n) - b);
                if (diffA < diffB && diffA < diffC) {
                    close = i;
                    break;
                }
            }
            System.out.println(close);
        }
    }
}
