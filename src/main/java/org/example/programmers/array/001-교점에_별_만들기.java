package org.example.programmers.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 교점에_별_만들기 {

    private static class Point {
        public final long x;
        public final long y;

        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public String[] solution(long[][] line) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            for (int j = i+1; j < line.length; j++) {
                Point intersection = intersection(
                        line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]
                );
                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }
        Point minimum = getMiminumPoint(points);
        Point maximum = getMaximumPoint(points);

        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        // 2차원 배열 초기화
        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        // 2차원 배열에 별 표시
        for (Point p : points) {
            // 2차원 배열의 크기에 맞춰 좌표 변환
            int x = (int) (p.x - minimum.x);
            int y = (int) (p.y - minimum.y);
            arr[y][x] = '*';
        }

        // 문자열 배열로 변환 후 반환
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }
        return result;
    }

    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        // 교점 구해서 반환하기
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);
        // 정수일 때만 반환
        if (x % 1 != 0 || y % 1 != 0) return null;

        return new Point((long) x, (long) y);
    }

    private Point getMiminumPoint(List<Point> points) {
        // 가장 작은 좌표 찾기
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }
        return new Point(x, y);
    }

    private Point getMaximumPoint(List<Point> points) {
        // 가장 큰 좌표 찾기
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }
        return new Point(x, y);
    }
}

class Main1 {
    public static void main(String[] args) {
        교점에_별_만들기 problem = new 교점에_별_만들기();
        long[][] line = {
                {2, -1, 4},
                {-2, -1, 4},
                {0, -1, 1},
                {5, -8, -12},
                {5, 8, 12}
        };
        System.out.println(Arrays.toString(problem.solution(line)));
    }
}
