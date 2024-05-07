package org.example.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 거스름돈 {
}

class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int[] coins = {500, 100, 50, 10, 5, 1};
        int changes = 1000 - money;
        int total = 0;
        for (int i = 0; i < coins.length; i++) {
            total += changes / coins[i];
            changes = changes % coins[i];
        }
        System.out.println(total);
    }
}
