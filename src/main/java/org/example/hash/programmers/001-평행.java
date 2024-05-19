package org.example.programmers.hash;

import java.util.HashSet;
import java.util.Set;

class 평행 {

    public double getSlope(int x1, int y1, int x2, int y2) {
        return (double) (y2 - y1) / (x2 - x1);
    }

    public int solution(int[][] dots) {
        Set<Double> slopes = new HashSet<>();
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double slope = getSlope(dots[i][0], dots[i][1], dots[j][0], dots[j][1]);
                if (slopes.contains(slope)) {
                    // Set에 담기 전에 이미 같은 기울기가 있다면 평행한 선이 존재하는 것이다.
                    return 1;
                }
                slopes.add(slope);
            }
        }
        return 0;
    }
}

class Main1 {
    public static void main(String[] args) {
        평행 problem = new 평행();
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.println(problem.solution(dots));
    }
}
