package org.example.programmers.sort;

import java.util.Arrays;

class K번째_수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < answer.length; i++) {
            int[] command = commands[i];
            // 정답 구해서 answer[i]에 넣기
            int from = command[0] - 1;
            int to = command[1];
            int k = command[2] - 1;
            int[] sub = Arrays.copyOfRange(array, from, to);
            Arrays.sort(sub);
            answer[i] = sub[k];
        }

        return answer;
    }
}

class Main124 {
    public static void main(String[] args) {
        K번째_수 problem = new K번째_수();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(problem.solution(array, commands)));
    }
}
