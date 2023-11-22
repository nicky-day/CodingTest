package org.example.boj.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class 줄_세우기 {
}

class Main165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int total = 0;
            for (int j = 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[j] > arr[k]) {
                        int temp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = temp;
                        total += 1;
                    }
                }
            }
            System.out.println(i + 1 + " " + total);
        }
    }
}
