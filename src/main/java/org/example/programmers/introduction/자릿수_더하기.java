package org.example.programmers.introduction;

class 자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}

class Main35 {
    public static void main(String[] args) {
        자릿수_더하기 problem = new 자릿수_더하기();
        System.out.println(problem.solution(1234));
    }
}
