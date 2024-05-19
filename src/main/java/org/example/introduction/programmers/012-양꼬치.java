package org.example.introduction.programmers;

class 양꼬치 {
    public int solution(int n, int k) {
        int answer = 0;
        int freeDrink = n / 10;
        k = Math.max(k - freeDrink, 0);
        answer = (n * 12000) + (k * 2000);
        return answer;
    }
}

class Main12 {
    public static void main(String[] args) {
        양꼬치 problem = new 양꼬치();
        System.out.println(problem.solution(10, 3));
    }
}
