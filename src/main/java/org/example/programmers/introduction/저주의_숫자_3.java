package org.example.programmers.introduction;

class 저주의_숫자_3 {
    public int solution(int n) {
        int answer = n;
        int i = 1;
        while (i <= answer) {
            if ((i % 3 == 0) || String.valueOf(i).contains("3")) {
                answer++;
            }
            i++;
        }
        return answer;
    }
}

class Main100 {
    public static void main(String[] args) {
        저주의_숫자_3 problem = new 저주의_숫자_3();
        int n = 15;
        System.out.println(problem.solution(n));
    }
}
