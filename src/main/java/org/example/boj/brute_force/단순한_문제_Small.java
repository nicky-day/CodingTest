package org.example.boj.brute_force;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 단순한_문제_Small {
}

class Main182 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            int total = 0;
            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= b; y++) {
                    for (int z = 1; z <= c; z++) {
                        int modA = x % a;
                        int modB = y % b;
                        int modC = z % c;
                        if ((modA == modB) && (modB == modC)) {
                            total += 1;
                        }
                    }
                }
            }
            System.out.println(total);
        }
    }
}
