package org.example.programmers.string;

class 숫자_문자열과_영단어 {
    private static final String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
    };

    public int solution(String s) {
        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], Integer.toString(i));

        }
        return Integer.parseInt(s);
    }
}

class Main8 {
    public static void main(String[] args) {
        숫자_문자열과_영단어 problem = new 숫자_문자열과_영단어();
        String s = "one4seveneight";
        System.out.println(problem.solution(s));
    }
}
