package org.example.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 캠핑 {
}

class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while (true) {
            String[] input = br.readLine().split(" ");
            int L = Integer.parseInt(input[0]);
            int P = Integer.parseInt(input[1]);
            int V = Integer.parseInt(input[2]);
            if (L == 0 && P == 0 && V == 0) return;
            int result = (V / P) * L + Math.min(L, V % ((V / P) * P));
            System.out.printf("Case %d: %d%n", i, result);
            i++;
        }
    }
}
