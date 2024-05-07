package org.example.boj.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class 개미 {
    
    public String solution(int[] map, int[] ant, int t) {
        int w = map[0];
        int h = map[1];

        int x = ant[0];
        int y = ant[1];

        int p = (x + t) / w;
        int q = (y + t) / h;

        if (p % 2 == 0) {
            x = (x + t) % w;
        } else {
            x = w - (x + t) % w;
        }

        if (q % 2 == 0) {
            y = (y + t) % h;
        } else {
            y = h - (y + t) % h;
        }
        return String.format("%d %d", x, y);
    }
}

class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] map = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] ant = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int t = Integer.parseInt(br.readLine());

        int w = map[0];
        int h = map[1];

        int x = ant[0];
        int y = ant[1];

        int p = (x + t) / w;
        int q = (y + t) / h;

        if (p % 2 == 0) {
            x = (x + t) % w;
        } else {
            x = w - (x + t) % w;
        }

        if (q % 2 == 0) {
            y = (y + t) % h;
        } else {
            y = h - (y + t) % h;
        }
        System.out.printf("%d %d", x, y);
    }
}
