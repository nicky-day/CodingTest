package org.example.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class 우유_축제 {
}

class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] shops = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int total = 0;
        int currentMilk = 0;
        for (int i = 0; i < shops.length; i++) {
            if (shops[i] == currentMilk % 3) {
                total++;
                currentMilk++;
            }
        }
        System.out.println(total);
    }
}
