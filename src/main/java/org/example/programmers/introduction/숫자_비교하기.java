package org.example.programmers.introduction;

class 숫자_비교하기 {
    public int solution(int num1, int num2) {
        return (num1 == num2) ? 1 : -1;
    }
}

class Main6 {
    public static void main(String[] args) {
        숫자_비교하기 problem = new 숫자_비교하기();
        System.out.println(problem.solution(2, 3));
    }
}
