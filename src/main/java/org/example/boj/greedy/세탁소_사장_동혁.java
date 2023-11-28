package org.example.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 세탁소_사장_동혁 {
}

class Main207 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] changes = {25, 10, 5, 1};
        for (int i = 0; i < T; i++) {
            int c = Integer.parseInt(br.readLine());
            int[] result = new int[4];
            for (int j = 0; j < changes.length; j++) {
                result[j] = c / changes[j];
                c = c % changes[j];
            }
            for (int k : result) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
