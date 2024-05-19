package org.example.introduction.programmers;

class 피자_나눠_먹기_1 {
    public int solution(int n) {
        int answer = 1;
        while (true) {
            if (answer * 7 >= n) {
                return answer;
            } else {
                answer += 1;
            }
        }
    }
}

class Main16 {
    public static void main(String[] args) {
        피자_나눠_먹기_1 problem = new 피자_나눠_먹기_1();
        System.out.println(problem.solution(7));
    }
}
