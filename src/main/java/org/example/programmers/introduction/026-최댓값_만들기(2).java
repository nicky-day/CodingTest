package org.example.programmers.introduction;

import java.util.Arrays;

class 최댓값_만들기_2 {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                answer = Math.max(answer, numbers[i] * numbers[j]);
            }
        }
        return answer;
    }
}

class Main26 {
    public static void main(String[] args) {
        최댓값_만들기_2 problem = new 최댓값_만들기_2();
        int[] numbers = {1, 2, -3, 4, -5};
        System.out.println(problem.solution(numbers));
    }
}
