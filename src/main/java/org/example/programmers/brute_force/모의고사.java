package org.example.programmers.brute_force;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    public int[] solution2(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i%5]) {
                score[0]++;
            }
            if (answers[i] == second[i%8]) {
                score[1]++;
            }
            if (answers[i] == third[i%10]) {
                score[2]++;
            }
        }
        int max = Arrays.stream(score).max().getAsInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (max == score[i]) {
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

class Main119 {
    public static void main(String[] args) {
        모의고사 problem = new 모의고사();
        int[] answers = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(problem.solution(answers)));
    }
}
