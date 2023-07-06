package org.example.programmers.introduction;

class 점의_위치_구하기 {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] <0 && dot[1] < 0) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }
}

class Main27 {
    public static void main(String[] args) {
        점의_위치_구하기 problem = new 점의_위치_구하기();
        int[] dot = {2, 4};
        System.out.println(problem.solution(dot));
    }
}
