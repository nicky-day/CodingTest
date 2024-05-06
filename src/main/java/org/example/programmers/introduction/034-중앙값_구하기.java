package org.example.programmers.introduction;

import java.util.Arrays;

class 중앙값_구하기 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}

class Main34 {
    public static void main(String[] args) {
        중앙값_구하기 problem = new 중앙값_구하기();
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(problem.solution(array));
    }
}
