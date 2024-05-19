package org.example.introduction.programmers;

class 나이_출력 {
    public int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }
}

class Main4 {
    public static void main(String[] args) {
        나이_출력 problem = new 나이_출력();
        System.out.println(problem.solution(40));
    }
}
