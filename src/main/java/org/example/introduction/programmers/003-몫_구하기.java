package org.example.introduction.programmers;

class 몫_구하기 {
     public int solution(int num1, int num2) {
        return num1 / num2;
    }
}

class Main3 {
    public static void main(String[] args) {
        몫_구하기 problem = new 몫_구하기();
        System.out.println(problem.solution(10, 5));
    }
}
