package org.example.programmers.string;

class 문자열_다루기_기본 {
    public boolean solution(String s) {
        return s.matches("[0-9]{4}|[0-9]{6}");
    }
}

class Main114 {
    public static void main(String[] args) {
        문자열_다루기_기본 problem = new 문자열_다루기_기본();
        String s = "1234";
        System.out.println(problem.solution(s));
    }
}
