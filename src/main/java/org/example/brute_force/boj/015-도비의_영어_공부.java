package org.example.brute_force.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

class 도비의_영어_공부 {
}

class Main15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            if (input.equals("#"))  break;

            String c = input.substring(0, 1);
            String sentence = input.substring(2).toLowerCase();

            int cnt = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (Objects.equals(c, String.valueOf(sentence.charAt(i)))) {
                    cnt++;
                }
            }
            System.out.printf("%s %d%n", c, cnt);
        }
    }
}
