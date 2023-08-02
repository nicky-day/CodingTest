package org.example.programmers.introduction;

class 팩토리얼 {
    public int factorial(int num) {
        if (num <= 2) {
            return num;
        }
        return num * factorial(num-1);
    }

    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[12];
        for (int i = 0; i <= 11; i++) {
            arr[i] = factorial(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (n < arr[i]) {
                answer = i - 1;
                break;
            }
        }
        return answer;
    }
}

class Main75 {
    public static void main(String[] args) {
        팩토리얼 problem = new 팩토리얼();
        int n = 3628800;
        System.out.println(problem.solution(n));
    }
}
