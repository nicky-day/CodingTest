package org.example.programmers.recursion;

import java.util.ArrayList;
import java.util.List;

class 모음_사전 {
    private static final char[] CHARS = "AEIOU".toCharArray();

    private List<String> generate(String word) {
        // 종료 조건, 점화식 구현
        List<String> words = new ArrayList<>();
        words.add(word);

        // 종료 조건
        if (word.length() == 5) {
            return words;
        }

        // 점화식 : 사용할 수 있는 모든 문자를 word에 이어 붙인다.
        for (char c : CHARS) {
            words.addAll(generate(word + c));
        }
        return words;
    }

    private void generate(String word, List<String> words) {
        words.add(word);

        if (word.length() == 5) return;
        for (char c : CHARS) {
            generate(word + c, words);
        }
    }

    public int solution(String word) {
        return generate("").indexOf(word);
    }

    public int solution2(String word) {
        List<String> words = new ArrayList<>();
        generate("", words);
        return words.indexOf(word);
    }
}

class Main3 {
    public static void main(String[] args) {
        모음_사전 problem = new 모음_사전();
        String word = "AAAAE";
        System.out.println(problem.solution(word));

    }
}
