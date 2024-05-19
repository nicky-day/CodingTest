package org.example.introduction.programmers;

class 특정_문자_제거하기 {
    public String solution(String my_string, String letter) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (!String.valueOf(my_string.charAt(i)).equals(letter)) {
                answer += String.valueOf(my_string.charAt(i));
            }
        }
        return answer;
    }
}

class Main27 {
    public static void main(String[] args) {
        특정_문자_제거하기 problem = new 특정_문자_제거하기();
        String my_string = "abcdef";
        String letter = "f";
        System.out.println(problem.solution(my_string, letter));
    }
}
