package org.example.brute_force.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 주사위 {
}

class Main17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int s1 = Integer.parseInt(input[0]);
        int s2 = Integer.parseInt(input[1]);
        int s3 = Integer.parseInt(input[2]);

        int[] arr = new int[101];
        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    arr[i + j + k]++;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int t = 0; t < arr.length; t++) {
            if (arr[t] > max) {
                max = arr[t];
                maxIndex = t;
            }
        }
        System.out.println(maxIndex);
    }
}
