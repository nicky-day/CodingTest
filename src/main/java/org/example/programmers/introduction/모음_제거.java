package org.example.programmers.introduction;

import java.util.Arrays;
import java.util.List;

class 모음_제거 {
    public String solution(String my_string) {
        String answer = "";
        List<String> vowel = Arrays.asList("a", "e", "i", "o", "u");
        for (int i = 0; i < my_string.length(); i++) {
            if (!vowel.contains(String.valueOf(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}

class Main32 {
    public static void main(String[] args) {
        모음_제거 problem = new 모음_제거();
        String my_string = "bus";
        System.out.println(problem.solution(my_string));
    }
}
