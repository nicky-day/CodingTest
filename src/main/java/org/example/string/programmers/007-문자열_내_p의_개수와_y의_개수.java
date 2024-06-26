package org.example.string.programmers;

class 문자열_내_p의_개수와_y의_개수 {
    public boolean solution(String s) {
        // 문자열을 모두 소문자로 변환
        s = s.toLowerCase();
        // p의 개수 세기
        int ps = s.length() - s.replace("p", "").length();
        // y의 개수 세기
        int ys = s.length() - s.replace("y", "").length();
        // 구한 p의 개수와 y의 개수 비교
        return ps == ys;
    }

    public boolean solution2(String s) {
        int ps = 0;
        int ys = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case 'p', 'P' -> ps++;
                case 'y', 'Y' -> ys++;
            }
        }

        return ps == ys;
    }
}

class Main7 {
    public static void main(String[] args) {
        문자열_내_p의_개수와_y의_개수 problem = new 문자열_내_p의_개수와_y의_개수();
        String s = "pPoooyY";
        System.out.println(problem.solution(s));
    }
}
