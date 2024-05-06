package org.example.programmers.introduction;

import java.util.Arrays;

class 배열_자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2+1);
    }
}

class Main37 {
    public static void main(String[] args) {
        배열_자르기 problem = new 배열_자르기();
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(Arrays.toString(problem.solution(numbers, num1, num2)));
    }
}
