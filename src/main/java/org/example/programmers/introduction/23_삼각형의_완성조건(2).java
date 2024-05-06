package org.example.programmers.introduction;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class 삼각형의_완성조건_2 {
    public int solution(int[] sides) {
        int answer = 0;
        Set<Integer> intSet = new HashSet<>();
        Arrays.sort(sides);

        // sides[2]이 max일 때
        for (int i = sides[1]; i < sides[0] + sides[1]; i++) {
            if (sides[0] + sides[1] > i) {
                intSet.add(i);
            }
        }

        // sides[1]이 max일 때
        for (int i = 1; i < sides[1]; i++) {
            if (sides[0] + i > sides[1]) {
                intSet.add(i);
            }
        }
        answer = intSet.size();
        return answer;
    }
}

class Main23 {
    public static void main(String[] args) {
        삼각형의_완성조건_2 problem = new 삼각형의_완성조건_2();
        int[] sides = {1, 2};
        System.out.println(problem.solution(sides));
    }
}
