package org.example.introduction.programmers;

class 각도기 {
    public int solution(int angle) {
        int answer = 0;
        if (angle == 180) {
            answer = 4;
        } else if (angle > 90) {
            answer = 3;
        } else if (angle == 90) {
            answer = 2;
        } else {
            answer = 1;
        }
        return answer;
    }
}

class Main9 {
    public static void main(String[] args) {
        각도기 problem = new 각도기();
        System.out.println(problem.solution(70));
    }
}
