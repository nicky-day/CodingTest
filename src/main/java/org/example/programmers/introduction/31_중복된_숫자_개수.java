package org.example.programmers.introduction;

class 중복된_숫자_개수 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int arr : array) {
            if (arr == n) {
                answer += 1;
            }
        }
        return answer;
    }
}

class Main31 {
    public static void main(String[] args) {
        중복된_숫자_개수 problem = new 중복된_숫자_개수();
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(problem.solution(array, n));
    }
}
