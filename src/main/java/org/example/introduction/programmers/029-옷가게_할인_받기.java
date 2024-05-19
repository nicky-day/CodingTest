package org.example.introduction.programmers;

class 옷가게_할인_받기 {
    public int solution(int price) {
        int answer = 0;
        if (price >= 500000) {
            answer = (int) (price * 0.8);
        } else if (price >= 300000) {
            answer = (int) (price * 0.9);
        } else if (price >= 100000) {
            answer = (int) (price * 0.95);
        } else {
            answer = price;
        }
        return answer;
    }
}

class Main29 {
    public static void main(String[] args) {
        옷가게_할인_받기 problem = new 옷가게_할인_받기();
        System.out.println(problem.solution(150000));
    }
}
