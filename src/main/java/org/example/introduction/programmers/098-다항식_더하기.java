package org.example.introduction.programmers;

class 다항식_더하기 {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" +");
        int linear = 0;
        int constant = 0;
        for (String s : arr) {
            if (s.equals("x")) {
                linear += 1;
            } else if (s.contains("x")) {
                linear += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if (!s.equals("+")) {
                constant += Integer.parseInt(s);
            }
        }
        if (linear != 0 && constant == 0) {
            if (linear == 1) {
                answer += "x";
            } else {
                answer += linear + "x";
            }
        }
        if (linear != 0 && constant != 0) {
            if (linear == 1) {
                answer += "x" + " + " + constant;
            } else {
                answer += linear + "x" + " + " + constant;
            }
        }
        if (linear == 0 && constant != 0) {
            answer += constant;
        }
        return answer;
    }
}

class Main98 {
    public static void main(String[] args) {
        다항식_더하기 problem = new 다항식_더하기();
        String polynomial = "3x + 7 + x";
        System.out.println(problem.solution(polynomial));
    }
}
