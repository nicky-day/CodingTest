package org.example.programmers.introduction;

class 세균_증식 {
    public int solution(int n, int t) {
        int answer = 1;
        answer = (int) Math.pow(2, t);
        answer *= n;
        return answer;
    }
}

class Main40 {
    public static void main(String[] args) {
        세균_증식 problem = new 세균_증식();
        System.out.println(problem.solution(2, 10));
    }
}
