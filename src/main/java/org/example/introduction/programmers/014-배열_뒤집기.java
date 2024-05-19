package org.example.introduction.programmers;

import java.util.Arrays;

class 배열_뒤집기 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[num_list.length - i - 1] = num_list[i];
        }
        return answer;
    }
}

class Main14 {
    public static void main(String[] args) {
        배열_뒤집기 problem = new 배열_뒤집기();
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(problem.solution(num_list)));
    }
}
