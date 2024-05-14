package org.example.boj.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class 괄호 {
}

class Main2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            char[] input = sc.next().toCharArray();
            Deque<Character> stack = new ArrayDeque<>();
            boolean isValid = true;
            for (char c : input) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) {
                isValid = false;
            }
            System.out.println(isValid ? "YES" : "NO");
        }
    }
}

class Main2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            char[] input = sc.next().toCharArray();
            int openCount = 0;
            for (char ch : input) {
                if (ch == '(') openCount++;
                else if (ch == ')') {
                    openCount--;
                    if (openCount < 0) break;
                }
            }
            System.out.println(openCount == 0 ? "YES" : "NO");
        }
    }
}
