package org.example.programmers.sort;

import java.util.Arrays;

class H_Index {

    private boolean isValid(int[] citations, int h) {
        int index = citations.length - h;
        return citations[index] >= h;
    }

    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int h = citations.length; h >= 1; h--) {
            // h 조건 검사
            if (isValid(citations, h)) return h;
        }
        return 0;
    }
}

class Main3 {
    public static void main(String[] args) {
        H_Index problem = new H_Index();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(problem.solution(citations));
    }
}
