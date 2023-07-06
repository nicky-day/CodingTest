package org.example.programmers.introduction;

class 배열의_평균값 {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = (double)sum / numbers.length;
        return answer;
    }
}

class Main11 {
    public static void main(String[] args) {
        배열의_평균값 problem = new 배열의_평균값();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(problem.solution(numbers));
    }
}
