package org.example.introduction.programmers;

class 숨어있는_숫자의_덧셈_2 {
    public int solution(String my_string) {
        int answer = 0;
        int i = 0;
        int j = 0;
        while (i < my_string.length()) {
            if (Character.isDigit(my_string.charAt(i))) {
                String num = "";
                num += my_string.charAt(i);
                j = i+1;
                while (j < my_string.length()) {
                    if (Character.isDigit(my_string.charAt(j))) {
                        num += my_string.charAt(j);
                        j++;
                    } else {
                        break;
                    }
                }
                i = j + 1;
                answer += Integer.parseInt(num);
            } else {
                i++;
            }
        }
        return answer;
    }
}

class Main40 {
    public static void main(String[] args) {
        숨어있는_숫자의_덧셈_2 problem = new 숨어있는_숫자의_덧셈_2();
        String my_string = "aAb1B2cC34oOp";
        System.out.println(problem.solution(my_string));
    }
}
