package org.example.programmers.introduction;

import java.util.Arrays;

class 잘라서_배열로_저장하기 {
    public String[] solution(String my_str, int n) {
        int answer_index = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[answer_index];
        int k = 0;
        int t = k + n;
        for (int i = 0; i < answer_index; i++) {
            if (t > my_str.length()) {
                t = my_str.length();
            }
            answer[i] = my_str.substring(k, t);
            k+=n;
            t+=n;
        }
        return answer;
    }
}

class Main87 {
    public static void main(String[] args) {
        잘라서_배열로_저장하기 problem = new 잘라서_배열로_저장하기();
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(Arrays.toString(problem.solution(my_str, n)));
    }
}
