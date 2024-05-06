package org.example.programmers.introduction;

class 피자_나눠_먹기_3 {
    public int solution(int slice, int n) {
        int answer = 1;
        while (true) {
            if (n <= slice * answer) {
                return answer;
            } else {
                answer++;
            }
        }
    }
}

class Main18 {
    public static void main(String[] args) {
        피자_나눠_먹기_3 problem = new 피자_나눠_먹기_3();
        System.out.println(problem.solution(7, 10));
    }
}
