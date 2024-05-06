package org.example.programmers.introduction;

import java.util.Arrays;

class 외계어_사전 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        String spellStr = String.join("", spell);
        for (String s : dic) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String dicStr = new String(chars);
            if (spellStr.equals(dicStr)) {
                answer = 1;
            }
        }
        return answer;
    }
}

class Main80 {
    public static void main(String[] args) {
        외계어_사전 problem = new 외계어_사전();
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(problem.solution(spell, dic));
    }
}
