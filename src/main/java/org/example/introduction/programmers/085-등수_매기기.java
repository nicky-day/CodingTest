package org.example.introduction.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class 등수_매기기 {
    public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for (int[] s : score) {
            scoreList.add(s[0] + s[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return answer;
    }
}

class Main85 {
    public static void main(String[] args) {
        등수_매기기 problem = new 등수_매기기();
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        System.out.println(Arrays.toString(problem.solution(score)));
    }
}
