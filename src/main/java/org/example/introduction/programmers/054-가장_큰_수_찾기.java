package org.example.introduction.programmers;

import java.util.Arrays;

class 가장_큰_수_찾기 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        answer[0] = max;
        answer[1] = index;
        return answer;
    }
}

class Main54 {
    public static void main(String[] args) {
        가장_큰_수_찾기 problem = new 가장_큰_수_찾기();
        int[] array = {1, 8, 3};
        System.out.println(Arrays.toString(problem.solution(array)));
    }
}
