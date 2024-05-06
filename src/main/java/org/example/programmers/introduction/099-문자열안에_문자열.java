package org.example.programmers.introduction;

class 문자열안에_문자열 {
    public int solution(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}

class Main99 {
    public static void main(String[] args) {
        문자열안에_문자열 problem = new 문자열안에_문자열();
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        System.out.println(problem.solution(str1, str2));
    }
}
