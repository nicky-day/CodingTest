package org.example.programmers.introduction;

import java.util.Arrays;

class 짝수_홀수_개수 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int evenCnt = 0;
        int oddCnt = 0;

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }
        answer[0] = evenCnt;
        answer[1] = oddCnt;
        return answer;
    }
}

class Main21 {
    public static void main(String[] args) {
        짝수_홀수_개수 problem = new 짝수_홀수_개수();
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(problem.solution(num_list)));
    }
}
