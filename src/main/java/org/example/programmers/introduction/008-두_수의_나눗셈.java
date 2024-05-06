package org.example.programmers.introduction;

class 두_수의_나눗셈 {
    public int solution(int num1, int num2) {
        double ret = (num1 / (double) num2) * 1000;
        int answer = (int) ret;
        return answer;
    }
}

class Main8 {
    public static void main(String[] args) {
        두_수의_나눗셈 problem = new 두_수의_나눗셈();
        System.out.println(problem.solution(3, 2));
    }
}
