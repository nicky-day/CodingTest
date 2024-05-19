package org.example.introduction.programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class 유한소수_판별하기 {
    public int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }

    public int[] getPrimeFactor(int b) {
        List<Integer> list = new ArrayList<>();
        int i = 2;
        while (i <= b) {
            if (b % i == 0) {
                list.add(i);
                b = b / i;
            } else {
                i++;
            }
        }
        Set<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        list.sort(null);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int solution(int a, int b) {
        int answer = 1;
        int gcd = getGCD(a, b);
        b /= gcd;
        int[] primeFactor = getPrimeFactor(b);
        for (int j : primeFactor) {
            if (j == 2 || j == 5) {
                continue;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}

class Main86 {
    public static void main(String[] args) {
        유한소수_판별하기 problem = new 유한소수_판별하기();
        int a = 7;
        int b = 20;
        System.out.println(problem.solution(a, b));
    }
}
