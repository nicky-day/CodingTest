package org.example.programmers.string;

import java.util.Arrays;

class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(int n) {
        // 1. 입력받은 숫자를 문자열로 변환한다.
        String str = Long.toString(n);
        // 2. 문자열을 뒤집는다.
        String reversed = new StringBuilder(str).reverse().toString();
        // 3. 뒤집힌 문자열을 문자의 배열로 변환한다.
        char[] arr = reversed.toCharArray();
        // 4. 배열의 각 문자를 정수로 변환한다.
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] - '0';
        }
        return result;


    }
}

class Main56 {
    public static void main(String[] args) {
        자연수_뒤집어_배열로_만들기 problem = new 자연수_뒤집어_배열로_만들기();
        int n = 12345;
        System.out.println(Arrays.toString(problem.solution(n)));
    }
}
