package org.example.string.programmers;

class 삼진법_뒤집기 {
    public int solution(int n) {
        // 3진법
        String str = Integer.toString(n, 3);
        // 문자열 뒤집기
        String reversed = new StringBuilder(str).reverse().toString();
        // 정수로 변환
        return Integer.valueOf(reversed, 3);
    }
}

class Main5 {
    public static void main(String[] args) {
        삼진법_뒤집기 problem = new 삼진법_뒤집기();
        int n = 45;
        System.out.println(problem.solution(n));
    }
}
