package org.example.programmers.hash;

import java.util.HashSet;
import java.util.Set;

class 중복된_문자_제거 {
    public String solution(String my_string) {
        Set<Character> used = new HashSet<>();

        StringBuilder builder = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (used.contains(c)) continue;
            used.add(c);
            builder.append(c);
        }

        return builder.toString();
    }
}

class Main2 {
    public static void main(String[] args) {
        중복된_문자_제거 problem = new 중복된_문자_제거();
        String my_string = "people";
        System.out.println(problem.solution(my_string));
    }
}
