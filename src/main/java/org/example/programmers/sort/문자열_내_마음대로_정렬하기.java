package org.example.programmers.sort;

import java.util.Arrays;

class 문자열_내_마음대로_정렬하기 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) != s2.charAt(n)) {
                return s1.charAt(n) - s2.charAt(n);
            }
            return s1.compareTo(s2);
        });
        return strings;
    }
}

class Main130 {
    public static void main(String[] args) {
        문자열_내_마음대로_정렬하기 problem = new 문자열_내_마음대로_정렬하기();
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(problem.solution(strings, n)));
    }
}
