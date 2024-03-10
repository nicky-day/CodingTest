package org.example.boj.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 문자열 {
}

class Main217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        int ans = A.length();
        for (int i = 0; i <= B.length() - A.length(); i++) {
            int diff = 0;
            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(i + j)) {
                    diff++;
                }
            }
            ans = Math.min(ans, diff);
        }
        System.out.println(ans);
    }
}
