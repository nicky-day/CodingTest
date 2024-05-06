package org.example.programmers.introduction;

class 숨어있는_숫자의_덧셈_1 {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }
        return answer;
    }
}

class Main39 {
    public static void main(String[] args) {
        숨어있는_숫자의_덧셈_1 problem = new 숨어있는_숫자의_덧셈_1();
        String my_string = "aAb1B2cC34oOp";
        System.out.println(problem.solution(my_string));
    }
}
