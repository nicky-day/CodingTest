package org.example.boj.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class 완전제곱수 {
}

class Main180 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (Math.sqrt(i) % 1 == 0.0) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(list.stream().mapToInt(Integer::intValue).sum());
            System.out.println(list.get(0));
        }
    }
}
