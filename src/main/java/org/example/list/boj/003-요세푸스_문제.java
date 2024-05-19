package org.example.list.boj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class 요세푸스_문제 {
}

class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int[] ans = new int[N];
        int pastIdx = 0;
        for (int i = 0; i < N; i++) {
            int targetIdx = (pastIdx + K - 1) % list.size();
            ans[i] = list.remove(targetIdx);
            pastIdx = targetIdx;
        }
        System.out.println("<" + Arrays.stream(ans)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")) + ">");
    }
}
