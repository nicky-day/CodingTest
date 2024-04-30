package org.example.boj.binary_search;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class 숫자_카드_2 {
}

class Main246 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = sc.nextInt();
        while (M-- > 0) {
            int x = sc.nextInt();
            bw.write(map.getOrDefault(x, 0) + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}

class Main247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        Arrays.sort(cards);


    }
}
