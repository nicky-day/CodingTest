package org.example.programmers.introduction;

class 이진수_더하기 {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int result = num1 + num2;
        answer = Integer.toBinaryString(result);
        return answer;
    }
}

class Main82 {
    public static void main(String[] args) {
        이진수_더하기 problem = new 이진수_더하기();
        String bin1 = "10";
        String bin2 = "11";
        System.out.println(problem.solution(bin1, bin2));
    }
}
