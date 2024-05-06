package org.example.programmers.introduction;

class 배열의_유사도 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}

class Main24 {
    public static void main(String[] args) {
        배열의_유사도 problem = new 배열의_유사도();
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(problem.solution(s1, s2));
    }
}
