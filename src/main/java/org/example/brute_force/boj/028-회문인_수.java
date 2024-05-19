package org.example.brute_force.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 회문인_수 {
    public boolean isPalindrome(int n, int base) {
        int[] digit = new int[20];
        int len = 0;
        while (n > 0) {
            digit[len++] = n % base;
            n /= base;
        }

        for (int i = 0; i < len / 2; i++) {
            if (digit[i] != digit[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

class Main28 {
    public static void main(String[] args) throws IOException {
        회문인_수 problem = new 회문인_수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            boolean ans = false;
            for (int base = 2; base <= 64; base++) {
                if (problem.isPalindrome(n, base)) {
                    ans = true;
                    break;

                }
            }
            System.out.println(ans ? 1 : 0);
        }
    }
}
