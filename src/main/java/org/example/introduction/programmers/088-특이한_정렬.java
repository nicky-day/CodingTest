package org.example.introduction.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 특이한_정렬 {
    public int[] solution(int[] numlist, int n) {
        List<Integer> arrList = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        arrList.sort((o1, o2) -> {
            int o1Abs = Math.abs(o1 - n);
            int o2Abs = Math.abs(o2 - n);

            if (o1Abs == o2Abs) {
                if (o1 > o2) return -1;
                else if (o1 < o2) return 1;
            } else {
                return o1Abs - o2Abs;
            }
            return 0;
        });
        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

class Main88 {
    public static void main(String[] args) {
        특이한_정렬 problem = new 특이한_정렬();
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;
        System.out.println(Arrays.toString(problem.solution(numlist, n)));
    }
}
