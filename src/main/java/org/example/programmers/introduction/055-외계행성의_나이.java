package org.example.programmers.introduction;

class 외계행성의_나이 {
    public String solution(int age) {
        String answer = "";
        String strAge = String.valueOf(age);
        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        for (int i = 0; i < strAge.length(); i++) {
            answer += alphabet[Integer.parseInt(String.valueOf(strAge.charAt(i)))];
        }
        return answer;
    }
}

class Main55 {
    public static void main(String[] args) {
        외계행성의_나이 problem = new 외계행성의_나이();
        int age = 23;
        System.out.println(problem.solution(age));
    }
}
