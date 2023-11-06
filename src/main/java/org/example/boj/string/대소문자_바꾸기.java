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
