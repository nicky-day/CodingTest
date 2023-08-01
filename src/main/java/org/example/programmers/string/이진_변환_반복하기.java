package org.example.programmers.string;

import java.util.Arrays;

class 이진_변환_반복하기 {
    public int[] solution(String s) {
        int loop = 0;
        int removed = 0;

        // 검사할 문자열이 1이 될 때까지 반복
        while (!s.equals(1)) {
            // s 변환하며 loop, removed 누적
            int zeros = countZeros(s);
            loop += 1;
            removed += zeros;
            // 문자열 s 변환
            int ones = s.length() - zeros;
            s = Integer.toString(ones, 2);
        }

        return new int[] {loop, removed};
    }

    private int countZeros(String s) {
        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
        }
        return zeros;
    }
}

class Main73 {

    public static void main(String[] args) {
        이진_변환_반복하기 problem = new 이진_변환_반복하기();
        String s = "110010101001";
        System.out.println(Arrays.toString(problem.solution(s)));
    }
}
