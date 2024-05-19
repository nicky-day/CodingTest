package org.example.introduction.programmers;

import java.util.List;
import java.util.stream.Collectors;

class A로_B_만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        List<Character> beforeList = before.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        List<Character> afterList = after.chars().mapToObj(c -> (char)c).collect(Collectors.toList());

        beforeList.sort(null);
        afterList.sort(null);

        if (afterList.equals(beforeList)) {
            answer = 1;
        }
        return answer;
    }
}

class Main66 {
    public static void main(String[] args) {
        A로_B_만들기 problem = new A로_B_만들기();
        String before = "olleh";
        String after = "hello";
        System.out.println(problem.solution(before, after));
    }
}
