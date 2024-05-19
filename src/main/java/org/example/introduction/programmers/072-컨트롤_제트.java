package org.example.introduction.programmers;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

class 컨트롤_제트 {
    public int solution(String s) {
        int answer = 0;
        List<String> list = List.of(s.split(" "));
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Z")) {
                if (!numList.isEmpty()) {
                    numList.remove(numList.size() - 1);
                }
            } else {
                numList.add(Integer.parseInt(list.get(i)));
            }
        }
        IntSummaryStatistics stats = numList.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        answer = (int) stats.getSum();
        return answer;
    }
}

class Main72 {
    public static void main(String[] args) {
        컨트롤_제트 problem = new 컨트롤_제트();
        String s = "1 2 Z 3";
        System.out.println(problem.solution(s));
    }
}
