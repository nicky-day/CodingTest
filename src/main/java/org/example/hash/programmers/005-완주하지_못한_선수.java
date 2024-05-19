package org.example.hash.programmers;

import java.util.HashMap;
import java.util.Map;

class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> count = new HashMap<>();
        for (String name : participant) {
            count.putIfAbsent(name, 0);
            count.put(name, count.get(name) + 1);
        }

        for (String name : completion) {
            int v = count.get(name) - 1;
            count.put(name, v);
            if (v == 0) count.remove(name);
        }

        return count.keySet().iterator().next();
    }
}

class Main5 {
    public static void main(String[] args) {
        완주하지_못한_선수 problem = new 완주하지_못한_선수();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(problem.solution(participant, completion));
    }
}
