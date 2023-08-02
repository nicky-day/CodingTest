package org.example.programmers.introduction;

import java.util.*;

class 소인수분해 {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                list.add(i);
                n = n / i;
            } else {
                i++;
            }
        }
        Set<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        list.sort(null);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

class Main84 {
    public static void main(String[] args) {
        소인수분해 problem = new 소인수분해();
        int n = 12;
        System.out.println(Arrays.toString(problem.solution(n)));
    }
}
