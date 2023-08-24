package org.example.programmers.sort;

class 입국_심사 {
    public long solution(int n, int[] times) {
        long start = 0;
        long end = 1000000000000000000L;
        while (end > start) {
            long t = (start + end) / 2;

            // 정답 검사, 범위 좁히기
            if (isValid(t, n, times)) {
                end = t;
            } else {
                start = t + 1;
            }
        }
        return start;
    }

    private boolean isValid(long t, int n, int[] times) {
        long c = 0;
        for (int time : times) {
            c += t / time;
        }
        return c >= n;
    }
}

class Main134 {
    public static void main(String[] args) {
        입국_심사 problem = new 입국_심사();
        int n = 6;
        int[] times = {7, 10};
        System.out.println(problem.solution(n, times));
    }
}
