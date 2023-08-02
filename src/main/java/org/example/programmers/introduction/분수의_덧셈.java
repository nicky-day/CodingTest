package org.example.programmers.introduction;

import java.util.Arrays;

class 분수의_덧셈 {
    int getLCM(int num1, int num2) {
        System.out.println("getGCD : " + getGCD(num1, num2));
        return (num1 * num2) / getGCD(num1, num2);
    }

    int getGCD(int num1, int num2) {
        if(num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int newNum = getLCM(num1, num2);
        int newDenum1 = denum1 * (getLCM(num1, num2) / num1);
        int newDenum2 = denum2 * (getLCM(num1, num2) / num2);

        int gcd = getGCD(newDenum1 + newDenum2, newNum);
        answer[0] = (newDenum1 + newDenum2) / gcd;
        answer[1] = newNum / gcd;

        return answer;
    }
}

class Main107 {
    public static void main(String[] args) {
        분수의_덧셈 problem = new 분수의_덧셈();
        int number1 = 1;
        int denum1 = 2;
        int number2 = 3;
        int denum2 = 4;
        System.out.println(Arrays.toString(problem.solution(number1, denum1, number2, denum2)));
    }
}
