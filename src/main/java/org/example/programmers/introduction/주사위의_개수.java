package org.example.programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;

class 주사위의_개수 {
    public int solution(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        return answer;
    }
}

class Main46 {
    public static void main(String[] args) {
        주사위의_개수 problem = new 주사위의_개수();
        int[] box = {10, 8, 6};
        int n = 3;
        System.out.println(problem.solution(box, 3));
    }
}
