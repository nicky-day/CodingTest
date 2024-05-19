package org.example.simulation.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ACM_호텔 {
}

class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            int H = Integer.parseInt(input[0]);
            int W = Integer.parseInt(input[1]);
            int N = Integer.parseInt(input[2]);

            int floor = ((N - 1) % H) + 1;
            int number = (N - 1) / H + 1;
            System.out.printf("%d%02d\n", floor, number);
        }
    }
}
