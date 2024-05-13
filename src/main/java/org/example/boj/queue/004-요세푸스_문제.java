package org.example.boj.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

class 요세푸스_문제 {
}

class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            // 고정된 원에서 포인터를 뒤로 이동하는게 아니라
            // 매번 (K-1)명의 사람을 뒤로 보내자.
            for (int j = 1; j < K; j++) {
                queue.add(queue.poll());
            }
            ans[i] = queue.poll();
        }

        System.out.println("<" + Arrays.stream(ans)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")) + ">");
    }
}
