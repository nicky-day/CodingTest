package org.example.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class 단어_공부 {
    public char solution(String word) {
        word = word.toLowerCase();
        int[] array = new int[26];
        for (char c : word.toCharArray()) {
            array[c - 97] += 1;
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            } else if (array[i] == max) {
                System.out.println(i);
                return '?';
            }
        }
        return (char) (maxIndex + 65);
    }
}

class Main160 {
    public static void main(String[] args) throws IOException {
//        단어_공부 problem = new 단어_공부();
//        String word = "Mississipi";
//        String word2 = "zZa";
//        System.out.println(problem.solution(word2));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        word = word.toLowerCase();
        int[] array = new int[26];
        for (char c : word.toCharArray()) {
            array[c - 97] += 1;
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        boolean duplicate = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max && maxIndex != i) {
                duplicate = true;
            }
        }
        System.out.println(duplicate ? '?' : (char)(maxIndex + 65));
    }
}
