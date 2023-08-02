package org.example.programmers.introduction;

import java.util.Arrays;

class 문자열_밀기 {
    public int solution(String A, String B) {
        int answer = 0;
        char[] aCharArray = A.toCharArray();
        char[] bCharArray = B.toCharArray();
        if (Arrays.equals(aCharArray, bCharArray)) {
            answer = 0;
            return answer;
        }
        int i = 0;
        while (i < A.length() - 1) {
            answer += 1;
            char[] array = new char[A.length()];
            for (int k = 0; k < A.length(); k++) {
                int t = k - 1;
                if (t < 0) {
                    t = A.length() - 1;
                }
                array[k] = aCharArray[t];
            }
            if (Arrays.equals(array, bCharArray)) {
                return answer;
            }
            aCharArray = array.clone();
            i++;
        }
        answer = -1;
        return answer;
    }
}

class Main102 {
    public static void main(String[] args) {
        문자열_밀기 problem = new 문자열_밀기();
        String A = "hello";
        String B = "ohell";
        System.out.println(problem.solution(A, B));
    }
}
