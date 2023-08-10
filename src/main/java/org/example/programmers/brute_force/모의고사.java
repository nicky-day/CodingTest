package org.example.programmers.brute_force;

import java.util.Arrays;
import java.util.stream.IntStream;

class 모의고사 {
    private static final int[][] RULES = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    private int getPicked(int person, int problem) {
        int[] rule = RULES[person];
        int index = problem % rule.length;
        return rule[index];
    }

    public int[] solution(int[] answers) {
        int[] corrects = new int[3];
        int max = 0;

        for (int problem = 0; problem < answers.length; problem++) {
            int answer = answers[problem];

            // 각 수포자별로 정답 개수 세기
            for (int person = 0; person < 3; person++) {
                int picked = getPicked(person, problem);
                if (answer == getPicked(person, problem)) {
                    if (++corrects[person] > max) {
                        max = corrects[person];
                    }
                }
            }
        }
        final int maxCorrects = max;
        return IntStream.range(0, 3)
                .filter(i -> corrects[i] == maxCorrects)
                .map(i -> i + 1)
                .toArray();
    }
}

class Main119 {
    public static void main(String[] args) {
        모의고사 problem = new 모의고사();
        int[] answers = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(problem.solution(answers)));
    }
}
