package org.example.programmers.introduction;

class 문자열_계산하기 {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        boolean mode = true;
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                answer += Integer.parseInt(str[i]);
            } else {
                if (str[i].equals("+")) {
                    mode = true;
                } else if (str[i].equals("-")) {
                    mode = false;
                } else {
                    if (mode) {
                        answer += Integer.parseInt(str[i]);
                    } else {
                        answer -= Integer.parseInt(str[i]);
                    }
                }
            }
        }
        return answer;
    }
}

class Main78 {
    public static void main(String[] args) {
        문자열_계산하기 problem = new 문자열_계산하기();
        String my_string = "3 + 4";
        System.out.println(problem.solution(my_string));
    }
}
