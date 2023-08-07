package org.example.programmers.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 하노이의_탑 {
    private List<int[]> hanoi(int n, int from, int to) {
        // 종료 조건, 점화식 구현
        if (n == 1) return List.of(new int[] {from, to});

        // 점화식 구현
        int empty = 6 - from - to;

        List<int[]> result = new ArrayList<>();
        result.addAll(hanoi(n-1, from, empty));
        result.addAll(hanoi(1, from, to));
        result.addAll(hanoi(n-1, empty, to));
        return result;
    }

    private void hanoi(int n, int from, int to, List<int[]> process) {
        if (n == 1) {
            process.add(new int[] {from, to});
            return;
        }
        int empty = 6 - from - to;
        hanoi(n-1, from, empty, process);
        hanoi(1, from, to, process);
        hanoi(n-1, empty, to, process);
    }

    public int[][] solution(int n) {
//        return hanoi(n, 1, 3).toArray(new int[0][]);
        List<int[]> process = new ArrayList<>();
        hanoi(n, 1, 3, process);
        return process.toArray(new int[0][]);
    }
}

class Main117 {
    public static void main(String[] args) {
        하노이의_탑 problem = new 하노이의_탑();
        int n = 2;
        System.out.println(Arrays.deepToString(problem.solution(n)));
    }
}
