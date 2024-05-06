package org.example.programmers.introduction;

import java.util.HashMap;
import java.util.Map;

class 겹치는_선분의_길이 {
    public int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] line : lines) {
            int from = Math.min(line[0], line[1]);
            int to = Math.max(line[0], line[1]);
            for (int i = from + 1; i <= to; i++) {
                map.merge(i, 1, Integer::sum);
            }
        }

        return (int) map.values().stream().filter(i -> i > 1).count();
    }
}

class Main92 {
    public static void main(String[] args) {
        겹치는_선분의_길이 problem = new 겹치는_선분의_길이();
        int[][] lines = {{0, 2}, {-3, -1}, {-2, 1}};
        System.out.println(problem.solution(lines));
    }
}
