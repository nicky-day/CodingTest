package org.example.programmers.introduction;

class 문자_반복_출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++){
                answer += my_string.charAt(i);
            };
        }
        return answer;
    }
}

class Main33 {
    public static void main(String[] args) {
        문자_반복_출력하기 problem = new 문자_반복_출력하기();
        String my_string = "hello";
        int n = 3;
        System.out.println(problem.solution(my_string, n));
    }
}
