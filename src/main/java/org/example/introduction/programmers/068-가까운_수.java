package org.example.introduction.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 가까운_수 {
    public int solution(int[] array, int n) {
        int answer = 0;
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        list.add(n);
        list.sort(null);
        int index = list.indexOf(n);
        if (index == 0) {
            answer = list.get(index+1);
            return answer;
        }
        if (index == list.size() - 1) {
            answer = list.get(index-1);
            return answer;
        }
        if (Math.abs(list.get(index-1) - n) > list.get(index+1) - n) {
            answer = list.get(index+1);
        } else {
            answer = list.get(index-1);
        }
        return answer;
    }
}

class Main68 {
    public static void main(String[] args) {
        가까운_수 problem = new 가까운_수();
        int[] array = {3, 10, 28};
        int n = 20;
        System.out.println(problem.solution(array, n));
    }
}
