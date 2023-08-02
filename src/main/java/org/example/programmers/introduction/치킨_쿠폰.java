package org.example.programmers.introduction;

class 치킨_쿠폰 {
    public int solution(int chicken) {
        int answer = 0;
        int div = 0;
        int mod = 0;
        while (chicken >= 10) {
            div = chicken / 10;
            mod = chicken % 10;
            answer += div;
            chicken = div + mod;
        }
        return answer;
    }
}

class Main97 {
    public static void main(String[] args) {
        치킨_쿠폰 problem = new 치킨_쿠폰();
        int chicken = 100;
        System.out.println(problem.solution(chicken));
    }
}
