package org.example.programmers.introduction;

import java.util.ArrayList;
import java.util.List;

class 중복된_문자_제거 {
    public String solution(String my_string) {
        char[] ch = my_string.toCharArray();
        List<String> arr = new ArrayList();
        for (int i = 0; i < my_string.length(); i++) {
            if (!arr.contains(String.valueOf(my_string.charAt(i)))) {
                arr.add(String.valueOf(my_string.charAt(i)));
            }
        }
        return String.join("", arr);
    }
}

class Main68 {
    public static void main(String[] args) {
        중복된_문자_제거 problem = new 중복된_문자_제거();
        String my_string = "people";
        System.out.println(problem.solution(my_string));
    }
}
