package org.example.boj.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class 좋은_암호 {
}

class Main22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        BigInteger k = new BigInteger(input[0]);
        int l = Integer.parseInt(input[1]);

        for (int i = 2; i < l; i++) {
            if (k.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                System.out.println(String.format("BAD %d", i));
                return;
            }
        }
        System.out.println("GOOD");
    }
}
