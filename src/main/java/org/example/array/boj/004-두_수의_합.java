package org.example.array.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class 두_수의_합 {
}

class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = Integer.parseInt(br.readLine());

        int[] sorted = new int[2000001];
        for (int i = 0; i < n; i++) {
            sorted[arr[i]]++;
        }

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int t = x - arr[i];
            if (t > 0 && sorted[t] != 0 && t != arr[i]) {
                result++;
                sorted[arr[i]] = 0;
                sorted[t] = 0;
            }
        }

        System.out.println(result);
    }
}
