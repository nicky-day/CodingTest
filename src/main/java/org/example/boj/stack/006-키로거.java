package org.example.boj.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class 키로거 {
}

class Main6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            char[] input = sc.next().toCharArray();
            Deque<Character> beforeCursor = new ArrayDeque<>();
            Deque<Character> afterCursor = new ArrayDeque<>();
            for (char cmd : input) {
                if (cmd == '-') {
                    beforeCursor.pollLast();
                } else if (cmd == '<') {
                    if (!beforeCursor.isEmpty())
                        afterCursor.offerFirst(beforeCursor.pollLast());
                } else if (cmd == '>') {
                    if (!afterCursor.isEmpty())
                        beforeCursor.offerLast(afterCursor.pollFirst());
                } else
                    beforeCursor.offerLast(cmd);
            }

            StringBuilder sb = new StringBuilder();
            while (!beforeCursor.isEmpty()) sb.append(beforeCursor.pollFirst());
            while (!afterCursor.isEmpty()) sb.append(afterCursor.pollFirst());
            System.out.println(sb);
        }
    }
}

class Main6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            char[] input = sc.next().toCharArray();
            Deque<Character> beforeCursor = new ArrayDeque<>();
            Deque<Character> afterCursor = new ArrayDeque<>();
            for (char cmd : input) {
                if (cmd == '-') {
                    beforeCursor.pollLast();
                } else if (cmd == '<') {
                    if (!beforeCursor.isEmpty())
                        afterCursor.offerLast(beforeCursor.pollLast());
                } else if (cmd == '>') {
                    if (!afterCursor.isEmpty())
                        beforeCursor.offerLast(afterCursor.pollLast());
                } else
                    beforeCursor.offerLast(cmd);
            }
            StringBuilder sb = new StringBuilder();
            while (!beforeCursor.isEmpty()) sb.append(beforeCursor.pollFirst());
            while (!afterCursor.isEmpty()) sb.append(afterCursor.pollLast());
            System.out.println(sb);
        }
    }
}
