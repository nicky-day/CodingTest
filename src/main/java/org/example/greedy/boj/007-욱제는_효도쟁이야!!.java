package org.example.greedy.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class 욱제는_효도쟁이야 {
}

class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] distances = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(distances);
        distances = Arrays.copyOfRange(distances, 0, n - 1);
        int minCost = Arrays.stream(distances).sum();
        System.out.println(minCost);
    }
}
