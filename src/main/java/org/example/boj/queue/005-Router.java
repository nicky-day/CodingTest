package org.example.boj.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;

class Router {
}

class Main5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> router = new LinkedList<>();
        while (true) {
            int cmd = sc.nextInt();
            if (cmd > 0) {
                if (router.size() < N)
                    router.offer(cmd);
            } else if (cmd == 0) {
                router.poll();
            } else break;
        }
        if (router.isEmpty())
            System.out.println("empty");
        else System.out.println(router.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}

class Main5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> router = new LinkedBlockingQueue<>(N);
        while (true) {
            int cmd = sc.nextInt();
            if (cmd > 0) router.offer(cmd);
            else if (cmd == 0) router.poll();
            else break;
        }
        if (router.isEmpty())
            System.out.println("empty");
        else System.out.println(router.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
