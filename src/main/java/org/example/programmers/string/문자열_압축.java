package org.example.programmers.string;

import java.util.ArrayList;
import java.util.List;

class 문자열_압축 {
    public int solution(String s) {
        int min = Integer.MAX_VALUE;
        for (int length = 1; length < s.length(); length++) {
            // 문자열 압축 후 가장 짧은 길이 선택
            int compressed = compress(s, length);
            if (compressed < min) {
                min = compressed;
            }
        }
        return min;
    }

    // 문자열을 압축하고, 압축된 문자열의 길이를 반환한다.
    private int compress(String source, int length) {
        StringBuilder builder = new StringBuilder();
        // 연속된 중복 문자열을 검사해야 하므로, 직전에 등장한 문자열을 담는 last 변수와 등장 횟수를 담는 count 변수
        String last = "";
        int count = 0;
        for (String token : split(source, length)) {
            // 압축 문자열 구성
            if (token.equals(last)) {
                count++;
            } else {
                // 새로운 토큰 등장 처리
                if (count > 1) builder.append(count);
                builder.append(last);
                last = token;
                count = 1;
            }
        }
        if (count > 1) builder.append(count);
        builder.append(last);

        return builder.length();
    }

    private List<String> split(String source, int length) {
        List<String> tokens = new ArrayList<>();
        // source를 length 만큼씩 잘라 tokens 리스트에 추가
        for (int startIndex = 0; startIndex < source.length(); startIndex += length) {
            // 문자열을 startIndex부터 잘라 token 리스트에 추가
            int endIndex = startIndex + length;
            if (endIndex > source.length()) endIndex = source.length();
            // 문자열을 startIndex부터 endIndex까지 잘라 token 리스트에 추가
            tokens.add(source.substring(startIndex, endIndex));
        }
        return tokens;
    }
}

class Main71 {
    public static void main(String[] args) {
        문자열_압축 problem = new 문자열_압축();
        String s = "abcabcabcabcdededededede";
        System.out.println(problem.solution(s));
    }
}
