package org.example.programmers.introduction;

import java.util.Arrays;

class 문자열_정렬하기_2 {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] charArr = answer.toCharArray();
        Arrays.sort(charArr);
        answer = new String(charArr);
        return answer;
    }
}

class Main53 {
    public static void main(String[] args) {
        문자열_정렬하기_2 problem = new 문자열_정렬하기_2();
        String my_string = "Bcad";
        System.out.println(problem.solution(my_string));
    }
}
