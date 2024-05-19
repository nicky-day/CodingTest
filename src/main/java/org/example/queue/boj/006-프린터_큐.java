package org.example.queue.boj;

import java.util.*;

class 프린터_큐 {
}

class Job {
    int index;
    int priority;

    public Job(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            Queue<Job> queue = new LinkedList<>();
            Integer[] prioritySequence = new Integer[N];
            for (int i = 0; i < N; i++) {
                prioritySequence[i] = sc.nextInt();
                queue.offer(new Job(i, prioritySequence[i]));
            }

            Arrays.sort(prioritySequence, Collections.reverseOrder());

            for (int i = 0; i < N; i++) {
                while (queue.peek().priority != prioritySequence[i]) {
                    queue.offer(queue.poll());
                }
                if (queue.peek().index == M) {
                    System.out.println(i + 1);
                    break;
                }
                queue.poll();
            }
        }
    }
}
