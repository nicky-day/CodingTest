package org.example.introduction.programmers;

class 대문자와_소문자 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}

class Main47 {
    public static void main(String[] args) {
        대문자와_소문자 problem = new 대문자와_소문자();
        System.out.println(problem.solution("abCdEfghIJ"));
    }
}
