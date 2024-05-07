package org.example.boj.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

class 암호제작 {
}

class Main18 {
    static ArrayList<Integer> primes = new ArrayList<>();
    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        BigInteger P = new BigInteger(input[0]);
        int K = Integer.parseInt(input[1]);
        isPrime = new boolean[K];

        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i < K; i++) {
            if (isPrime[i]) {
                primes.add(i);
                for (int j = i * 2; j < K; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int prime : primes) {
            if (P.mod(BigInteger.valueOf(prime)).equals(BigInteger.ZERO)) {
                System.out.println("BAD " + prime);
                return;
            }
        }

        System.out.println("GOOD");
    }
}


