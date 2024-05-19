package org.example.introduction.programmers;

class 피자_바꿔_먹기_2 {
    public int getLCM(int a, int b) {
        int gcd = getGGD(a, b);
        return (a * b) / gcd;
    }

    public int getGGD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGGD(b, a % b);
    }

    public int solution(int n) {
        int answer = 1;
        while (true) {
            if (getLCM(n, answer * 6) == answer * 6) {
                return answer;
            } else {
                answer += 1;
            }
        }
    }
}

class Main17 {
    public static void main(String[] args) {
        피자_바꿔_먹기_2 problem = new 피자_바꿔_먹기_2();
        int n = 6;
        System.out.println(problem.solution(6));
    }
}
