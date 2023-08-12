package org.example.programmers.brute_force;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class 수식_최대화 {
    private static final String[][] precedences = {
            "+-*".split(""),
            "+*-".split(""),
            "-+*".split(""),
            "-*+".split(""),
            "*+-".split(""),
            "*-+".split("")
    };

    private long calculate(long lhs, long rhs, String op) {
        return switch (op) {
            case "+" -> lhs + rhs;
            case "-" -> lhs - rhs;
            case "*" -> lhs * rhs;
            default -> 0;
        };
    }

    private long calculate(List<String> tokens, String[] precedence) {
        for (String op : precedence) {
            for (int i = 0; i < tokens.size(); i++) {
                if (tokens.get(i).equals(op)) {
                    long lhs = Long.parseLong(tokens.get(i - 1));
                    long rhs = Long.parseLong(tokens.get(i + 1));
                    long result = calculate(lhs, rhs, op);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.add(i - 1, String.valueOf(result));
                    i -= 1;
                }
            }
        }
        return Long.parseLong(tokens.get(0));
    }

    public long solution(String expression) {
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*", true);
        List<String> tokens = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }

        long max = 0;
        for (String[] precedence : precedences) {
            long value = Math.abs(calculate(new ArrayList<>(tokens), precedence));
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}

class Main121 {
    public static void main(String[] args) {
        수식_최대화 problem = new 수식_최대화();
        String expression = "100-200*300-500+20";
        String expression2 = "50*6-3*2";
        System.out.println(problem.solution(expression));
        System.out.println(problem.solution(expression2));
    }
}
