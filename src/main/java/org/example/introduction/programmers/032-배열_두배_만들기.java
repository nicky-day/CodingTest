package org.example.introduction.programmers;

import java.util.Arrays;

class 배열_두배_만들기 {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }
}

class Main32 {
    public static void main(String[] args) {
        배열_두배_만들기 problem = new 배열_두배_만들기();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(problem.solution(numbers)));
    }
}
