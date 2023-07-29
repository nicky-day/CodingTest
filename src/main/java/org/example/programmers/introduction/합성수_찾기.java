package org.example.programmers.introduction;

class 합성수_찾기 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            for (int j = 2; j <= (int)Math.sqrt(i); j++) {
                if (i % j == 0) {
                    answer += 1;
                    break;
                }
            }
        }
        return answer;
    }
}

class Main67 {
    public static void main(String[] args) {
        합성수_찾기 problem = new 합성수_찾기();
        int n = 10;
        System.out.println(problem.solution(n));
    }
}
