package org.example.sort.programmers;

import java.util.Arrays;
import java.util.Collections;

class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        return s.chars()
                .boxed()
                .sorted((v1, v2) -> v2 - v1)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    public String solution2(String s) {
        String answer = "";
        String[] array = s.split("");
        Arrays.sort(array, Collections.reverseOrder());
        return String.join("", array);
    }
}

class Main4 {
    public static void main(String[] args) {
        문자열_내림차순으로_배치하기 problem = new 문자열_내림차순으로_배치하기();
        String s = "Zbcdefg";
        System.out.println(problem.solution(s));
    }
}
