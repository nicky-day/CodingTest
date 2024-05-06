package org.example.programmers.introduction;

class 한_번만_등장한_문자 {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                answer += (char)(i + 97);
            }
        }
        return answer;
    }
}

class Main70 {
    public static void main(String[] args) {
        한_번만_등장한_문자 problem = new 한_번만_등장한_문자();
        String s = "abcabcadc";
        System.out.println(problem.solution(s));
    }
}
