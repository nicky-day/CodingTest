package org.example.introduction.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 짝수는_싫어요 {
    public Integer[] solution(int n) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                arrList.add(i);
            }
        }
        Integer[] answer = arrList.toArray(new Integer[0]);
        return answer;
    }
}

class Main41 {
    public static void main(String[] args) {
        짝수는_싫어요 problem = new 짝수는_싫어요();
        System.out.println(Arrays.toString(problem.solution(10)));
    }
}
