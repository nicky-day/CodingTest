package org.example.boj.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

class AC {
}

class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- > 0) {
            char[] cmds = sc.next().toCharArray();
            int N = sc.nextInt();
            StringTokenizer st = new StringTokenizer(sc.next(), "[,]");
            Deque<String> deque = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                deque.offerLast(st.nextToken());
            }

            boolean isFlipped = false;
            boolean isValid = true;
            for (char cmd : cmds) {
                if (cmd == 'D') {
                    if (deque.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    if (isFlipped) deque.pollLast();
                    else deque.pollFirst();
                } else if (cmd == 'R') {
                    isFlipped = !isFlipped;
                }
            }

            if (isValid) {
                StringBuilder sb = new StringBuilder();
                while (!deque.isEmpty()) {
                    sb.append(isFlipped ? deque.pollLast() : deque.pollFirst());
                    if (!deque.isEmpty()) sb.append(",");
                }
                System.out.println("[" + sb.toString() + "]");
            }
            else System.out.println("error");
        }
    }
}
