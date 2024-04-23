package org.example.boj.prefix_sum;

import java.util.Arrays;
import java.util.Scanner;

class Generic_Queries {
}

class Main231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] acc = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            acc[i] = acc[i - 1] ^ arr[i];
        }

        System.out.println(Arrays.toString(acc));

        int ans = 0;

        while (Q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            ans ^= acc[r] | acc[l - 1];
        }

        System.out.println(ans);
    }
}
