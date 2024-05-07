package org.example.boj.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 신기한_수 {
}

class Main16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += Integer.parseInt(String.valueOf(s.charAt(j)));
            }
            if (i % sum == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
