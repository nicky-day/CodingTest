package org.example.programmers.introduction;

import java.util.ArrayList;
import java.util.Arrays;

class N의_배수_고르기 {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                arrayList.add(num);
            }
        }
        int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

class Main45 {
    public static void main(String[] args) {
        N의_배수_고르기 problem = new N의_배수_고르기();
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(problem.solution(n, numlist)));
    }
}
