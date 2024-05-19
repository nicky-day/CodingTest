package org.example.introduction.programmers;

import java.util.Arrays;

class 삼각형의_완성조건_1 {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if (sides[2] >= sides[0] + sides[1]) {
            answer = 2;
        } else {
            answer = 1;
        }
        return answer;
    }
}

class Main22 {
    public static void main(String[] args) {
        삼각형의_완성조건_1 problem = new 삼각형의_완성조건_1();
        int[] sides = {1, 2, 3};
        System.out.println(problem.solution(sides));
    }
}
