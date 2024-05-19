package org.example.introduction.programmers;

class 다음에_올_숫자 {
    public int solution(int[] common) {
        int diff = 0;
        int answer = 0;
        if ((common[1] - common[0]) == (common[2] - common[1])) {
            diff = common[1] - common[0];
            answer = common[common.length - 1] + diff;
        } else {
            diff = common[1] / common[0];
            answer = common[common.length - 1] * diff;
        }

        return answer;
    }
}

class Main96 {
    public static void main(String[] args) {
        다음에_올_숫자 problem = new 다음에_올_숫자();
        int[] common = {1, 2, 3, 4};
        System.out.println(problem.solution(common));
    }
}
