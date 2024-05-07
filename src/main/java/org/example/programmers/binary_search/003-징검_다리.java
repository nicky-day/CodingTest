package org.example.programmers.binary_search;

import java.util.Arrays;

class 징검_다리 {

    private boolean isValid(int d, int[] rocks, int n) {
        int removed = 0;    // 제거한 바위 개수
        int last = 0;       // 마지막 바위 위치
        for (int rock : rocks) {
            if (rock - last < d) {
                removed++;
                continue;
            }
            last = rock;
        }
        return removed <= n;
    }

    public int solution(int distance, int[] rocks, int n) {
        rocks = Arrays.copyOf(rocks, rocks.length + 1);
        rocks[rocks.length - 1] = distance;
        Arrays.sort(rocks);

        int start = 1;
        int end = distance + 1;

        while (end - start > 1) {
            int d = (start + end) / 2;

            // d 조건 검사 후 범위 좁히기
            if (isValid(d, rocks, n)) {
                start = d;
            } else {
                end = d;
            }
        }
        return start;
    }
}

class Main3 {
    public static void main(String[] args) {
        징검_다리 problem = new 징검_다리();
        int distance = 25;
        int[] rocks = {2, 14, 11, 21, 17};
        int n = 2;
        System.out.println(problem.solution(distance, rocks, 2));
    }
}
