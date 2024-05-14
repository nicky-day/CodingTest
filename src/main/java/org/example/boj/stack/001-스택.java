package org.example.boj.stack;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

class 스택 {
}

class Main1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        while (N-- > 0) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push")) {
                stack.push(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("pop")) {
                bw.write(stack.isEmpty() ? "-1\n" : stack.pop() + "\n");
            } else if (cmd[0].equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (cmd[0].equals("empty")) {
                bw.write(stack.isEmpty() ? "1\n" : "0\n");
            } else if (cmd[0].equals("top")) {
                bw.write(stack.isEmpty() ? "-1\n" : stack.peek() + "\n");
            }
        }
        bw.flush();
    }
}

class Main1_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int topIndex = -1;
        while (N-- > 0) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push")) {
                stack[++topIndex] = Integer.parseInt(cmd[1]);
            } else if (cmd[0].equals("pop")) {
                bw.write(topIndex == -1 ? "-1\n" : stack[topIndex--] + "\n");
            } else if (cmd[0].equals("size")) {
                bw.write(topIndex + 1 + "\n");
            } else if (cmd[0].equals("empty")) {
                bw.write(topIndex == -1 ? "1\n" : "0\n");
            } else if (cmd[0].equals("top")) {
                bw.write(topIndex == -1 ? "-1\n" : stack[topIndex] + "\n");
            }
        }
        bw.flush();
    }
}
