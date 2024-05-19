package org.example.greedy.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 오와_육의_차이 {
}

class Main5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String a = input[0];
        String b = input[1];

        int maxA = Integer.parseInt(a.replace("5", "6"));
        int minA = Integer.parseInt(a.replace("6", "5"));
        int maxB = Integer.parseInt(b.replace("5", "6"));
        int minB = Integer.parseInt(b.replace("6", "5"));

        System.out.println((minA + minB) + " " + (maxA + maxB));
    }
}
