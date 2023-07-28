package org.example.programmers.string;

class 시저_암호 {

    public String solution(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            // c를 n만큼 민 문자를 builder에 이어 붙이기
            builder.append(push(c, n));
        }
        return builder.toString();
    }

    private char push(char c, int n) {
        if (!Character.isAlphabetic(c)) return c;
        // c를 n만큼 밀어 반환
        int offset = Character.isUpperCase(c) ? 'A': 'a';
        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);
        return (char) (position + offset);
    }
}

class Main57 {
    public static void main(String[] args) {
        시저_암호 problem = new 시저_암호();
        String s = "AB";
        int n = 1;
        System.out.println(problem.solution(s, 1));
    }
}
