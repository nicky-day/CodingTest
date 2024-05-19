package org.example.stack.boj;

import java.util.Scanner;

class 스택_수열 {
}

class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] stack = new int[N];
        int topIndex = -1;
        int nextNumber = 1;
        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            // 1. x가 push 되어있지 않다면 x까지 push한다.
            while (nextNumber <= x) {
                sb.append("+\n");
                stack[++topIndex] = nextNumber++;
            }
            // 2. top이 x인지 확인한다.
            // 2-1. top이 x라면 pop
            // 2-2. top이 x가 아니라면 불가능
            if (topIndex < 0 || stack[topIndex] != x) {
                sb.setLength(0);
                sb.append("NO\n");
                break;
            }
            sb.append("-\n");
            topIndex--;
        }
        System.out.println(sb);
    }
}
