package org.example.programmers.introduction;

class 개미_군단 {
    public int solution(int hp) {
        int answer = 0;
        int generalAnt = 0;
        int soldierAnt = 0;
        int ant = 0;
        generalAnt += hp / 5;
        hp %= 5;
        soldierAnt += hp / 3;
        hp %= 3;
        if (hp != 0) ant += hp;
        answer = generalAnt + soldierAnt + ant;
        return answer;
    }
}

class Main46 {
    public static void main(String[] args) {
        개미_군단 problem = new 개미_군단();
        System.out.println(problem.solution(23));
    }
}
