package org.example.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 전자레인지 {
}

class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] buttons = {300, 60, 10};

        int[] result = new int[3];
        for (int i = 0; i < buttons.length; i++) {
            result[i] = T / buttons[i];
            T = T % buttons[i];
        }

        if (T != 0) {
            System.out.println(-1);
            return;
        }

        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
