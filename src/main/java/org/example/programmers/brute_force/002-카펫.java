package org.example.programmers.brute_force;

import java.util.Arrays;

class 카펫 {
    public int[] solution(int brown, int yellow) {
        for (int width = 3; width <= 5000; width++) {
            for (int height = 3; height <= width; height++) {
                // 조건 검사
                int boundary = (width + height - 2) * 2;
                int center = width * height - boundary;

                if (brown == boundary && yellow == center) {
                    return new int[]{width, height};
                }
            }
        }
        return null;
    }
}

class Main2 {
    public static void main(String[] args) {
        카펫 problem = new 카펫();
        int brown = 10;
        int yellow = 2;
        System.out.println(Arrays.toString(problem.solution(brown, yellow)));
    }
}
