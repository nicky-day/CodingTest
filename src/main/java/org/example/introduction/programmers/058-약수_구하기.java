package org.example.introduction.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class 약수_구하기 {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        for (int i = 2; i < (n / 2) + 1; i++) {
            if (n % i == 0) {
                arrList.add(i);
            }
        }
        if (n > 1) arrList.add(n);
        Collections.sort(arrList);
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

class Main58 {
    public static void main(String[] args) {
        약수_구하기 problem = new 약수_구하기();
        int n = 24;
        System.out.println(Arrays.toString(problem.solution(n)));
    }
}
