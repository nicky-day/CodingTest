package org.example.introduction.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 문자열_정렬하기_1 {
    public int[] solution(String my_string) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                arrayList.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }
        int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}

class Main52 {
    public static void main(String[] args) {
        문자열_정렬하기_1 problem = new 문자열_정렬하기_1();
        String my_string = "hi12392";
        System.out.println(Arrays.toString(problem.solution(my_string)));
    }
}
