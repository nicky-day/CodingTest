package org.example.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 문서_검색 {
    public int solution(String document, String word) {
        int result = 0;
        int i = 0;
        while (i <= document.length() - 1) {
            String mid = document.substring(i, document.length() - 1);
            if (mid.contains(word)) {
                result += 1;
                i += word.length();
            } else {
                i++;
            }
        }
        return result;
    }

    public int solution2(String document, String word) {
        int count = 0;
        int startIndex = 0;

        while (true) {
            int findIndex = document.indexOf(word, startIndex);
            if (findIndex < 0) break;
            count++;
            startIndex = findIndex + word.length();
        }
        return count;
    }

    public int solution3(String document, String word) {
        String replaced = document.replace(word, "");
        int length = document.length() - replaced.length();
        return length / word.length();
    }
}

class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String document = br.readLine();
        String word = br.readLine();

        int result = 0;
        int i = 0;
        while (i <= document.length() - 1 && i + word.length() <= document.length()) {
            String mid = document.substring(i, i + word.length());
            if (mid.contains(word)) {
                result += 1;
                i += word.length();
            } else {
                i++;
            }
        }
        System.out.println(result);
    }
}
