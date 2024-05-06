package org.example.programmers.introduction;

class 숫자_찾기 {
    public int solution(int num, int k) {
        int answer = 0;
        String strNum = String.valueOf(num);
        String kNum = String.valueOf(k);
        for (int i = 0; i < strNum.length(); i++) {
            if (String.valueOf(strNum.charAt(i)).equals(kNum)) {
                answer = i + 1;
                return answer;
            }
        }
        answer = -1;
        return answer;
    }
}

class Main60 {
    public static void main(String[] args) {
        숫자_찾기 problem = new 숫자_찾기();
        int num = 29183;
        int k = 1;
        System.out.println(problem.solution(num, k));
    }
}
