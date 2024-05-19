package org.example.introduction.programmers;

import java.util.Arrays;

class 아이스_아메리카노 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cup = money / 5500;
        int res = money % 5500;
        answer[0] = cup;
        answer[1] = res;
        return answer;
    }
}

class Main15 {
    public static void main(String[] args) {
        아이스_아메리카노 problem = new 아이스_아메리카노();
        System.out.println(Arrays.toString(problem.solution(5500)));
    }
}
