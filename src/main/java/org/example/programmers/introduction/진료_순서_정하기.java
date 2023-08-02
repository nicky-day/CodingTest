package org.example.programmers.introduction;

import java.util.Arrays;
import java.util.Comparator;

class 진료_순서_정하기 {
    public int[] solution(int[] emergency) {
        return Arrays.stream(emergency)
                .map(i -> Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder()).toList().indexOf(i) + 1).toArray();
    }
}

class Main80 {
    public static void main(String[] args) {
        진료_순서_정하기 problem = new 진료_순서_정하기();
        int[] emergency = {3, 76, 24};
        System.out.println(Arrays.toString(problem.solution(emergency)));
    }
}
