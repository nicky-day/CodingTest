package org.example.programmers.priority_queue;

import java.util.Arrays;
import java.util.PriorityQueue;

class 이중_우선순위_큐 {
    private static class DoublyPriorityQueue {
        private int size = 0;
        private final PriorityQueue<Integer> minPq = new PriorityQueue<>();
        private final PriorityQueue<Integer> maxPq = new PriorityQueue<>((a, b) -> b - a);

        public void add(int value) {
            minPq.add(value);
            maxPq.add(value);
            size++;
        }

        public void removeMax() {
            if (size == 0) return;
            maxPq.poll();
            if (--size == 0) {
                maxPq.clear();
                minPq.clear();
            }
        }

        public void removeMin() {
            if (size == 0) return;
            minPq.poll();
            if (--size == 0) {
                maxPq.clear();
                minPq.clear();
            }
        }

        public int max() {
            if (size == 0) return 0;
            return maxPq.peek();
        }

        public int min() {
            if (size == 0) return 0;
            return minPq.peek();
        }
    }

    public int[] solution(String[] operations) {
        DoublyPriorityQueue dpq = new DoublyPriorityQueue();
        for (String operation : operations) {
            String[] tokens = operation.split(" ");
            String command = tokens[0];
            String value = tokens[1];
            // 연산 처리
            switch (command) {
                case "I" -> dpq.add(Integer.parseInt(value));
                case "D" -> {
                    if (value.equals("1")) {
                        dpq.removeMax();
                    } else {
                        dpq.removeMin();
                    }
                }
            }
        }
        return new int[]{dpq.max(), dpq.min()};
    }
}

class Main1 {
    public static void main(String[] args) {
        이중_우선순위_큐 problem = new 이중_우선순위_큐();
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        String[] operations2 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(Arrays.toString(problem.solution(operations)));
        System.out.println(Arrays.toString(problem.solution(operations2)));
    }
}
