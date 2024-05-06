package org.example.programmers.introduction;

class 순서쌍의_개수 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += 1;
            }
        }
        return answer;
    }
}

class Main28 {
    public static void main(String[] args) {
        순서쌍의_개수 problem = new 순서쌍의_개수();
        System.out.println(problem.solution(20));
    }
}
