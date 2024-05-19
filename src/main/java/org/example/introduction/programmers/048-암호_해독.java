package org.example.introduction.programmers;

class 암호_해독 {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code-1; i < cipher.length(); i+=code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
}

class Main48 {
    public static void main(String[] args) {
        암호_해독 problem = new 암호_해독();
        System.out.println(problem.solution("dfjardstddetckdaccccdegk", 4));
    }
}
