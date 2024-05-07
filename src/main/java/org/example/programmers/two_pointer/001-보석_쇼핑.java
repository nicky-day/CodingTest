package org.example.programmers.two_pointer;

import java.util.*;

class 보석_쇼핑 {
    public int[] solution(String[] gems) {
        int start = 0;
        int end = gems.length - 1;

        Set<String> gemSet = new HashSet<>(List.of(gems));

        int s = 0;
        int e = s;
        Map<String, Integer> includes = new HashMap<>();
        includes.put(gems[s], 1);

        while (s < gems.length) {
            // [s, e] 구간 검사
            if (includes.keySet().size() == gemSet.size()) {
                // 모든 보석 포함
                if (e - s < end - start) {
                    start = s;
                    end = e;
                }
                includes.put(gems[s], includes.get(gems[s]) - 1);
                if (includes.get(gems[s]) == 0) {
                    includes.remove(gems[s]);
                }
                s++;
            } else if (e < gems.length - 1) {
                e++;
                includes.put(gems[e], includes.getOrDefault(gems[e], 0) + 1);
            } else {
                break;
            }
        }
        return new int[] {start + 1, end + 1};
    }
}

class Main1 {
    public static void main(String[] args) {
        보석_쇼핑 problem = new 보석_쇼핑();
        String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        System.out.println(Arrays.toString(problem.solution(gems)));
    }
}
