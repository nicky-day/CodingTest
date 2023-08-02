package org.example.programmers.introduction;

class 구슬을_나누는_경우의_수 {
    public int combination(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else {
            return combination(n-1, r-1) + combination(n-1, r);
        }
    }

    public int solution(int balls, int share) {
        return combination(balls, share);
    }
}

class Main90 {
    public static void main(String[] args) {
        구슬을_나누는_경우의_수 problem = new 구슬을_나누는_경우의_수();
        int balls = 3;
        int share = 2;
        System.out.println(problem.solution(balls, share));
    }
}
