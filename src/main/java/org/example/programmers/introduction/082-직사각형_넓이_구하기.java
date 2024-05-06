package org.example.programmers.introduction;

import java.util.Arrays;

class 직사각형_넓이_구하기 {
    public int solution(int[][] dots) {
        int answer = 0;
        Arrays.sort(dots, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }else {
                return o1[0] - o2[0];
            }
        });
        int height = Math.abs(dots[1][1] - dots[0][1]);
        int weight = Math.abs(dots[2][0] - dots[0][0]);
        answer = weight * height;
        return answer;
    }
}

class Main82 {
    public static void main(String[] args) {
        직사각형_넓이_구하기 problem = new 직사각형_넓이_구하기();
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        System.out.println(problem.solution(dots));
    }
}
