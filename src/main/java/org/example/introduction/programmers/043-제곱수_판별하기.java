package org.example.introduction.programmers;

class 제곱수_판별하기 {
    public int solution(int n) {
        int answer = 0;
        Double sqrt = Math.sqrt(n);
        if(sqrt == sqrt.intValue()) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}

class Main43 {
    public static void main(String[] args) {
        제곱수_판별하기 problem = new 제곱수_판별하기();
        System.out.println(problem.solution(144));
    }
}
