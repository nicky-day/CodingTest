package org.example.programmers.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

class 가장_큰_수 {
    public String solution(int[] numbers) {
        // 숫자를 이어붙일 수 있도록 모두 문자열로 변환한다.
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> {
                    int original = Integer.parseInt(s1 + s2);
                    int reverse = Integer.parseInt(s2 + s1);
                    // 역순 정렬
                    return reverse - original;
                })
                .collect(Collectors.joining(""))
                // 시작 부분에 0이 반복해서 나타나면 0 하나로 대체한다.
                .replaceAll("^0+", "0");
    }
}

class Main131 {
    public static void main(String[] args) {
        가장_큰_수 problem = new 가장_큰_수();
        int[] numbers = {6, 10, 2};
        System.out.println(problem.solution(numbers));
    }
}
