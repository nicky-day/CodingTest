package org.example.introduction.programmers;

class 종이_자르기 {
    public int solution(int M, int N) {
        int answer = 0;
        int width = M - 1;
        int height = M * (N - 1);
        answer = width + height;
        return answer;
    }
}

class Main81 {
    public static void main(String[] args) {
        종이_자르기 problem = new 종이_자르기();
        int M = 2;
        int N = 2;
        System.out.println(problem.solution(M, N));
    }
}
