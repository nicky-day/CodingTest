package org.example.programmers.introduction;

import java.util.HashMap;
import java.util.Map;

class 모스부호_1 {
    public String solution(String letter) {
        Map<String, String> alphabetMap = new HashMap<>() {
            {
                put(".-", "a");
                put("-...", "b");
                put("-.-.", "c");
                put("-..", "d");
                put(".", "e");
                put("..-.", "f");
                put("--.", "g");
                put("....", "h");
                put("..", "i");
                put(".---", "j");
                put("-.-", "k");
                put(".-..", "l");
                put("--", "m");
                put("-.", "n");
                put("---", "o");
                put(".--.", "p");
                put("--.-", "q");
                put(".-.", "r");
                put("...", "s");
                put("-", "t");
                put("..-", "u");
                put("...-", "v");
                put(".--", "w");
                put("-..-", "x");
                put("-.--", "y");
                put("--..", "z");
            }
        };
        String answer = "";
        String[] letterArr = letter.split(" ");
        for (String arr : letterArr) {
            answer += alphabetMap.get(arr);
        }
        return answer;
    }
}

class Main63 {
    public static void main(String[] args) {
        모스부호_1 problem = new 모스부호_1();
        String letter = ".... . .-.. .-.. ---";
        System.out.println(problem.solution(letter));
    }
}
