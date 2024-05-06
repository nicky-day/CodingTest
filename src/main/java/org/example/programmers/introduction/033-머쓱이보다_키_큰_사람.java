package org.example.programmers.introduction;

class 머쓱이보다_키_큰_사람 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int arr : array) {
            if (arr > height) {
                answer += 1;
            }
        }
        return answer;
    }
}

class Main33 {
    public static void main(String[] args) {
        머쓱이보다_키_큰_사람 problem = new 머쓱이보다_키_큰_사람();
        int[] array = {149, 180, 192, 170};
        int height = 167;
        System.out.println(problem.solution(array, height));
    }
}
