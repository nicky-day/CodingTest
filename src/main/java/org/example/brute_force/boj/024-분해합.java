package org.example.brute_force.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 분해합 {
}

class Main24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String str = Integer.toString(i);
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += Integer.parseInt(str.substring(j, j+1));
            }
            if (i + sum == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
