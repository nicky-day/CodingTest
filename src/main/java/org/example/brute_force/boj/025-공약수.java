package org.example.brute_force.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class 공약수 {
}

class Main25 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int gcd = getGCD(arr[0], getGCD(arr[1], arr[arr.length - 1]));

        for (int i = 1; i <= gcd / 2; i++) {
            if (gcd % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(gcd);
    }

    public static int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }
}
