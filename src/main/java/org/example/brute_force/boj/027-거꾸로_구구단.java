package org.example.brute_force.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

class 거꾸로_구구단 {
}

class Main27 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        Integer[] arr = new Integer[k];
        for (int i = 1; i <= k; i++) {
            String num = String.valueOf(n * i);
            String reversedNum = new StringBuilder(num).reverse().toString();
            arr[i-1] = Integer.parseInt(reversedNum);
        }

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[0]);
    }
}
