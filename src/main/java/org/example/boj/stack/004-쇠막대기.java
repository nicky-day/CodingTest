package org.example.boj.stack;

import java.util.Scanner;

class 쇠막대기 {
}

class Main4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = sc.next().toCharArray();
        int openCount = 0;
        int ans = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(')
                // 레이저 혹은 쇠막대기 시작
                openCount++;
            else if (input[i] == ')') {
                openCount--;
                if (input[i - 1] == '(') {
                    // 레이저
                    ans += openCount;
                } else
                    // 쇠막대기 끝
                    ans++;
            }
        }
        System.out.println(ans);
    }
}

class Main4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = sc.next().toCharArray();
        int ans = 0;
        int stick = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(') {
                if (input[i + 1] == ')') {
                    // 레이저
                    ans += stick;
                    i++;
                } else {
                    // 쇠막대기 시작
                    stick++;
                }
            } else {
                // 쇠막대기 끝
                ans++;
                stick--;
            }
        }
        System.out.println(ans);
    }
}

class Main4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int N = input.length();
        char[] arr = new char[N + 1];
        System.arraycopy(input.toCharArray(), 0, arr, 1, N);

        int[] accLaser = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            accLaser[i] = accLaser[i - 1];
            if (arr[i] == '(' && arr[i + 1] == ')') {
                accLaser[i]++;
            }
        }

        int ans = 0;
        int[] opend = new int[N + 1];
        int topIndex = -1;
        for (int i = 1; i <= N; i++) {
            if (arr[i] == '(' && arr[i + 1] != ')') {
                opend[++topIndex] = i;
            }
            else if (arr[i] == ')' && arr[i - 1] != '(') {
                int openIndex = opend[topIndex--];
                ans += accLaser[i] - accLaser[openIndex - 1] + 1;
            }
        }

        System.out.println(ans);
    }
}
