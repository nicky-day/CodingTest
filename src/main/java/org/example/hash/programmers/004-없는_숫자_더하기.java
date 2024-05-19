package org.example.hash.programmers;

import java.util.HashSet;
import java.util.Set;

class 없는_숫자_더하기 {

    public int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int v : numbers) {
            set.add(v);
        }

        int sum = 0;
        for (int n = 0; n <= 9; n++) {
            if (set.contains(n)) continue;
            sum += n;
        }
        return sum;
    }
}

class Main4 {
    public static void main(String[] args) {
        없는_숫자_더하기 problem = new 없는_숫자_더하기();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(problem.solution(numbers));
    }
}
