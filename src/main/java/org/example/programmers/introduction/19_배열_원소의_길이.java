package org.example.programmers.introduction;

import java.util.Arrays;

class 배열_원소의_길이 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}

class Main19 {
    public static void main(String[] args) {
        배열_원소의_길이 problem = new 배열_원소의_길이();
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(problem.solution(strlist)));
    }
}
