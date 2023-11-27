package org.example.boj.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 줄_세우기 {
}

class Main199 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int l = Integer.parseInt(input[1]);

        int labelCnt = 0;
        int currentLabel = 0;
        while (labelCnt < n) {
            currentLabel += 1;
            if (!Integer.toString(currentLabel).contains(Integer.toString(l))) {
                labelCnt++;
            }
        }
        System.out.println(currentLabel);
    }
}

