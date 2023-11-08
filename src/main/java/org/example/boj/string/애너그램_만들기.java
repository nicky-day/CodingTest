package org.example.boj.string;


import java.util.HashMap;
import java.util.Map;

class 애너그램_만들기 {
    public int solution(String word1, String word2) {
        int cnt = 0;
        Map<Character, Integer> word1Map = new HashMap<>();
        Map<Character, Integer> word2Map = new HashMap<>();
        for (char c : word1.toCharArray()) {
            word1Map.put(c, word1Map.get(c) == null ? 1 : word1Map.get(c) + 1);
        }
        for (char c : word2.toCharArray()) {
            word2Map.put(c, word2Map.get(c) == null ? 1 : word2Map.get(c) + 1);
        }

        for (char key : word1Map.keySet()) {
            if (word2Map.get(key) == null) {
                cnt += word1Map.get(key);
            } else if (word1Map.get(key) > word2Map.get(key)) {
                cnt += word1Map.get(key) - word2Map.get(key);
            }
        }

        for (char key : word2Map.keySet()) {
            if (word1Map.get(key) == null) {
                cnt += word2Map.get(key);
            } else if (word2Map.get(key) > word1Map.get(key)) {
                cnt += word2Map.get(key) - word1Map.get(key);
            }
        }
        return cnt;
    }
}

class Main159 {
    public static void main(String[] args) {
        애너그램_만들기 problem = new 애너그램_만들기();
        String word1 = "aabbcc";
        String word2 = "xxyybb";
        System.out.println(problem.solution(word1, word2));
    }
}
