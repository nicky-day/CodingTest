package org.example.stack.boj;

import java.util.Scanner;

class 균형잡힌_세상 {
}

class Main11 {

    static boolean isMatch(char open, char close) {
        if (open == '(' && close == ')') return true;
        if (open == '[' && close == ']') return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            char[] line = sc.nextLine().toCharArray();
            if (line.length == 1 && line[0] == '.') break;

            char[] opend = new char[line.length];
            int topIndex = -1;
            boolean isValid = true;
            for (char ch : line) {
                if (ch == '(' || ch == '[') {
                    opend[++topIndex] = ch;
                }
                else if (ch == ')' || ch == ']') {
                    if (topIndex < 0 || !isMatch(opend[topIndex--], ch)) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (topIndex >= 0) isValid = false;
            System.out.println(isValid ? "yes" : "no");
        }
    }
}
