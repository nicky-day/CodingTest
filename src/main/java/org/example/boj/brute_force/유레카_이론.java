package org.example.boj.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 유레카_이론 {
}

class Main181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] triNum = new int[46];
        for (int i = 0; i < triNum.length; i++) {
            triNum[i] = i * (i + 1) / 2;
        }

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            int result = eureka(triNum, k);
            System.out.println(result);
        }
    }

    private static int eureka(int[] triNum, int k) {
        for (int x = 1; x < triNum.length; x++) {
            for (int y = 1; y < triNum.length; y++) {
                for (int z = 1; z < triNum.length; z++) {
                    if (triNum[x] + triNum[y] + triNum[z] == k) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
