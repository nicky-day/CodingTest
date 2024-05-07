package org.example.programmers.string;

class 이상한_문자_만들기 {

    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        boolean toUpper = true;

        for (char c : s.toCharArray()) {
            // c를 적절히 변환하여 builder에 추가
            if (!Character.isAlphabetic(c)) {
                // 공백처리
                builder.append(c);
                // 다음에 올 알파벳은 무조건 대문자 : 인덱스 0이므로 짝수
                toUpper = true;
            } else {
                // 알파벳 변환
                if (toUpper) {
                    builder.append(Character.toUpperCase(c));
                } else {
                    builder.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        return builder.toString();
    }
}

class Main3{
    public static void main(String[] args) {
        이상한_문자_만들기 problem = new 이상한_문자_만들기();
        String s = "try hello world";
        System.out.println(problem.solution(s));
    }
}
