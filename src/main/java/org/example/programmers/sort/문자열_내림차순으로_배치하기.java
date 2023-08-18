package org.example.programmers.sort;

class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        return s.chars()
                .boxed()
                .sorted((v1, v2) -> v2 - v1)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }
}

class Main129 {
    public static void main(String[] args) {
        문자열_내림차순으로_배치하기 problem = new 문자열_내림차순으로_배치하기();
        String s = "Zbcdefg";
        System.out.println(problem.solution(s));
    }
}
