package org.example.boj.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class 대소문자_바꾸기 {
    public String solution(String words) {
        StringBuilder builder = new StringBuilder();
        for (char c : words.toCharArray()) {
            builder.append(
                    Character.isLowerCase(c)
                            ? Character.toUpperCase(c)
                            : Character.toLowerCase(c));
        }
        return builder.toString();
    }

    public void solution2(String words) {
        for (int i = 0; i < words.length(); i++) {
            if ('A' <= words.charAt(i) && words.charAt(i) <= 'Z') {
                System.out.println((char) ('a' + words.charAt(i) - 'A'));
            } else {
                System.out.println((char) ('A' + words.charAt(i) - 'a'));
            }
        }
    }
}

class Main158 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();

        StringBuilder builder = new StringBuilder();
        for (char c : words.toCharArray()) {
            builder.append(
                    Character.isLowerCase(c)
                            ? Character.toUpperCase(c)
                            : Character.toLowerCase(c));
        }
        System.out.println(builder.toString());
    }
}
