package org.example.programmers.introduction;

class 공_던지기 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = (k - 1) * 2;
        answer = index % numbers.length + 1;
        return answer;
    }
}

class Main75 {
    public static void main(String[] args) {
        공_던지기 problem = new 공_던지기();
        int[] numbers = {1, 2, 3, 4};
        int k = 2;
        System.out.println(problem.solution(numbers, k));
    }
}
