package org.example.hash.programmers;

import java.util.HashMap;
import java.util.Map;

class A로_B_만들기 {

    private static Map<Character, Integer> toMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }
        return map;
    }

    public int solution(String before, String after) {
        return toMap(before).equals(toMap(after)) ? 1 : 0;
    }
}

class Main3 {
    public static void main(String[] args) {
        A로_B_만들기 problem = new A로_B_만들기();
        String before = "olleh";
        String after = "hello";
        System.out.println(problem.solution(before, after));
    }
}
