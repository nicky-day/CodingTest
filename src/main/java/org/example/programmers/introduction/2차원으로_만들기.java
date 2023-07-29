package org.example.programmers.introduction;

class 이차원으로_만들기 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int num = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[num];
                num++;
            }
        }
        return answer;
    }
}

class Main70 {
    public static void main(String[] args) {
        이차원으로_만들기 problem = new 이차원으로_만들기();
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        System.out.println(problem.solution(num_list, n));
    }
}
