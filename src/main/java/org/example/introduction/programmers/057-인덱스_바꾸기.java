package org.example.introduction.programmers;

class 인덱스_바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();
        char ch1 = charArray[num1];
        char ch2 = charArray[num2];
        charArray[num1] = ch2;
        charArray[num2] = ch1;
        String answer = new String(charArray);
        return answer;
    }
}

class Main57 {
    public static void main(String[] args) {
        인덱스_바꾸기 problem = new 인덱스_바꾸기();
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        System.out.println(problem.solution(my_string, num1, num2));
    }
}
