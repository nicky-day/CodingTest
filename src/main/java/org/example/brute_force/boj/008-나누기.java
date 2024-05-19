package org.example.brute_force.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 나누기 {
}

class Main8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        n = n - n % 100;
        for (int i = 0; i < 100; i++) {
            if (n % f == 0) {
                System.out.printf("%02d%n", i);
                break;
            }
            n++;
        }
    }
}
