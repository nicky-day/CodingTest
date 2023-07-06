package org.example.programmers.introduction;

import java.util.Arrays;

class 문자열_뒤집기 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            answer += my_string.charAt(my_string.length() - i - 1);
        }
        return answer;
    }
}

class Main20 {
    public static void main(String[] args) {
        문자열_뒤집기 problem = new 문자열_뒤집기();
        System.out.println(problem.solution("jaron"));
    }
}
