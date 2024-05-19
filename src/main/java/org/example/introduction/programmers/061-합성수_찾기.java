package org.example.introduction.programmers;

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

class Main61 {
    public static void main(String[] args) {
        합성수_찾기 problem = new 합성수_찾기();
        int n = 10;
        System.out.println(problem.solution(n));
    }
}
