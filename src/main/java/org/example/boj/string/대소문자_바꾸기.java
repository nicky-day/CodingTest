package org.example.boj.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class 대소문자_바꾸기 {
    public String solution(String word) {
        StringBuilder builder = new StringBuilder();
        for (char c : word.toCharArray()) {
            builder.append(
                    Character.isLowerCase(c)
                            ? Character.toUpperCase(c)
                            : Character.toLowerCase(c));
        }
        return builder.toString();
    }

    public void solution2(String word) {
        for (int i = 0; i < word.length(); i++) {
            if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                System.out.println((char) ('a' + word.charAt(i) - 'A'));
            } else {
                System.out.println((char) ('A' + word.charAt(i) - 'a'));
            }
        }
    }
}

class Main158 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        StringBuilder builder = new StringBuilder();
        for (char c : word.toCharArray()) {
            builder.append(
                    Character.isLowerCase(c)
                            ? Character.toUpperCase(c)
                            : Character.toLowerCase(c));
        }
        System.out.println(builder.toString());
    }
}
