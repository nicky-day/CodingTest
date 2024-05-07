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

class Main5_1 {
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

class Main5_2 {

    static int findLowerBoundIndex(int[] arr, int x) {
        // x 이상의 값이 처음으로 나타나는 위치
        int lowerBoundIndex = arr.length;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] < x) l = m + 1;
            else {
                r = m - 1;
                lowerBoundIndex = m;
            }
        }
        return lowerBoundIndex;
    }

    static int findUpperBoundIndex(int[] arr, int x) {
        // x 초과의 값이 처음으로 나타나는 위치
        int upperBoundIndex = arr.length;
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] <= x) l = m + 1;
            else {
                r = m - 1;
                upperBoundIndex = m;
            }
        }
        return upperBoundIndex;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = sc.nextInt();
        while (M-- > 0) {
            int x = sc.nextInt();
            int lowerBoundIndex = findLowerBoundIndex(cards, x);
            int upperBoundIndex = findUpperBoundIndex(cards, x);
            bw.write(upperBoundIndex - lowerBoundIndex + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}

class Main5_3 {

    static int findLowerBoundIndex(int[] arr, int x) {
        // x 이상의 값이 처음으로 나타나는 위치
        int l = 0;
        int r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < x) l = m + 1;
            else r = m;
        }
        return l;
    }

    static int findUpperBoundIndex(int[] arr, int x) {
        // x 초과의 값이 처음으로 나타나는 위치
        int l = 0;
        int r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] <= x) l = m + 1;
            else r = m;
        }
        return l;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = sc.nextInt();
        while (M-- > 0) {
            int x = sc.nextInt();
            int lowerBoundIndex = findLowerBoundIndex(cards, x);
            int upperBoundIndex = findUpperBoundIndex(cards, x);
            bw.write(upperBoundIndex - lowerBoundIndex + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
