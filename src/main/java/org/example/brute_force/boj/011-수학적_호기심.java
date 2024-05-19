package org.example.brute_force.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 수학적_호기심 {
}

class Main11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            double n = Integer.parseInt(input[0]);
            double m = Integer.parseInt(input[1]);

            int cnt = 0;
            for (int x = 1; x < n; x++) {
                for (int y = x + 1; y < n; y++) {
                    if (((x * x + y * y + m) % (x * y)) == 0) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
