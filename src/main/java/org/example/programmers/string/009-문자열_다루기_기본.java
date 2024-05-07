package org.example.programmers.string;

class 문자열_다루기_기본 {
    public boolean solution(String s) {
        return s.matches("[0-9]{4}|[0-9]{6}");
    }

    public boolean solution2(String s) {
        if ((s.length() == 4 || s.length() == 6)) {
            try {
                int x = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else return false;
    }
}

class Main9 {
    public static void main(String[] args) {
        문자열_다루기_기본 problem = new 문자열_다루기_기본();
        String s = "1234";
        System.out.println(problem.solution(s));
    }
}
