package org.example.introduction.programmers;

import java.util.Arrays;

class 배열_회전시키기 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int j;
            if (direction.equals("right")) {
                j = i - 1;
                if (j < 0) {
                    j = numbers.length - 1;
                }
            } else {
                j = i + 1;
                if (j > numbers.length - 1) {
                    j = 0;
                }
            }
            answer[i] = numbers[j];
        }
        return answer;
    }
}

class Main56 {
    public static void main(String[] args) {
        배열_회전시키기 problem = new 배열_회전시키기();
        int[] numbers = {1, 2, 3};
        String direction = "right";
        System.out.println(Arrays.toString(problem.solution(numbers, direction)));
    }
}
