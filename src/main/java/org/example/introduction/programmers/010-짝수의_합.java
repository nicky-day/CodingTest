package org.example.introduction.programmers;

class 짝수의_합 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 ==  0) {
                answer += i;
            }
        }
        return answer;
    }
}

class Main10 {
    public static void main(String[] args) {
        짝수의_합 problem = new 짝수의_합();
        System.out.println(problem.solution(10));
    }
}
