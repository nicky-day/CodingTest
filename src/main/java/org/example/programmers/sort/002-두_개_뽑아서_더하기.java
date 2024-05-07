package org.example.programmers.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class 두_개_뽑아서_더하기 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }
}

class Main2 {
    public static void main(String[] args) {
        두_개_뽑아서_더하기 problem = new 두_개_뽑아서_더하기();
        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(problem.solution(numbers)));
    }
}
