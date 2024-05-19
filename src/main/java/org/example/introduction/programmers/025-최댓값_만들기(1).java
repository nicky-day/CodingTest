package org.example.introduction.programmers;

import java.util.Arrays;

class 최댓값_만들기_1 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}

class Main25 {
    public static void main(String[] args) {
        최댓값_만들기_1 problem = new 최댓값_만들기_1();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(problem.solution(numbers));
    }
}
