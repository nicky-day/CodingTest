package org.example.programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 연속된_수의_합 {
    public int[] solution(int num, int total) {
        List<Integer> arr = new ArrayList<>();
        for (int i = -500; i < 500; i++) {
            int sum = 0;
            for (int j = i; j < i + num; j++) {
                sum += j;
            }
            if (sum == total) {
                for (int j = i; j < i + num; j++) {
                    arr.add(j);
                }
            }
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

class Main108 {
    public static void main(String[] args) {
        연속된_수의_합 problem = new 연속된_수의_합();
        int num = 3;
        int total = 12;
        System.out.println(Arrays.toString(problem.solution(num, total)));
    }
}
