package org.example.programmers.array;

import java.util.Arrays;

class 행렬의_곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 결과 행렬의 크기
        int[][] arr = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // arr[i][j]의 값 구하기
                arr[i][j] = 0;
                for (int k = 0; k < arr1[i].length; k++) {
                    arr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return arr;
    }
}

class Main55 {
    public static void main(String[] args) {
        행렬의_곱셈 problem = new 행렬의_곱셈();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        System.out.println(Arrays.deepToString(problem.solution(arr1, arr2)));
    }
}
