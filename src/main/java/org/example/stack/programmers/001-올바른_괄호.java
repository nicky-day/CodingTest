package org.example.stack.programmers;

import java.util.Stack;

class 올바른_괄호 {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(' -> stack.push(c);
                case ')' -> {
                    if (stack.isEmpty()) return false;
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}

class Main1 {
    public static void main(String[] args) {
        올바른_괄호 problem = new 올바른_괄호();
        String s = "()()";
        System.out.println(problem.solution(s));
    }
}
