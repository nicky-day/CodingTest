package org.example.programmers.introduction;

class 편지 {
    public int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;
        return answer;
    }
}

class Main13 {
    public static void main(String[] args) {
        편지 problem = new 편지();
        System.out.println(problem.solution("happy birthday!"));
    }
}
