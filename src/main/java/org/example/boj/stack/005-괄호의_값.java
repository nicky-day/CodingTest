package org.example.boj.stack;

import java.util.Scanner;

class 괄호의_값 {
}

class Element {
    enum Type {DELIMITER, SCORE}

    Type type;
    int value;

    Element(Type type, int value) {
        this.type = type;
        this.value = value;
    }
}

/**
 * 풀이 1 : 괄호가 닫힐 때 괄호 안의 모든 값을 계산해 스택에 넣는다.
 * - 닫는 괄호가 나오면 쌍이 되는 여는 괄호를 빼고 값을 계산해 넣는다.
 * - 여는 괄호보다 최근값은 모두 괄호쌍의 안에 있는 값이므로 모두 더해 괄호값을 곱한다.
 */
class Main5_1 {

    static int delimiterToValue(char delimiter) {
        if (delimiter == '(' || delimiter == ')') return 2;
        if (delimiter == '[' || delimiter == ']') return 3;
        return -1;
    }

    static boolean isValidInput(char[] input) {
        char[] stack = new char[input.length];
        int topIndex = -1;
        for (char ch : input) {
            if (ch == '(' || ch == '[') {
                stack[++topIndex] = ch;
            } else if (ch == ')' || ch == ']') {
                if (topIndex < 0) return false;
                if (delimiterToValue(stack[topIndex]) != delimiterToValue(ch)) return false;
                topIndex--;
            }
        }
        return topIndex < 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = sc.next().toCharArray();
        if (!isValidInput(input)) {
            System.out.println(0);
            return;
        }

        Element[] stack = new Element[31];
        int topIndex = -1;
        for (char ch : input) {
            if (ch == '(' || ch == '[') {
                stack[++topIndex] = new Element(Element.Type.DELIMITER, ch);
            } else {
                int innerScore = 0;
                while (stack[topIndex].type == Element.Type.SCORE) {
                    innerScore += stack[topIndex--].value;
                }
                int score = innerScore * delimiterToValue(ch);
                if (score == 0) score = delimiterToValue(ch);
                stack[topIndex] = new Element(Element.Type.SCORE, score);
            }
        }

        int ans = 0;
        while (topIndex >= 0) {
            ans += stack[topIndex--].value;
        }
        System.out.println(ans);
    }
}

class Status {
    char openDelimiter;
    int innerSum;

    Status(char openDelimiter) {
        this.openDelimiter = openDelimiter;
        this.innerSum = 0;
    }
}

/**
 * 풀이 2 : 스택을 이용해 괄호들의 값을 레벨별로 누적한다.
 * - 자신의 값은 누적된 값 * 괄호값
 * - 스택에서 나갈 때 자신의 바로 아래에 있는 부모 괄호에 그 값을 더한다.
 * - 자신보다 한 단계 높은 스택에 쌓이는 괄호를 자식, 자신보다 한 단계 낮은 스택에 쌓인 괄호를 부모라고 하면 (XYZ)에서 X, Y, Z의 값이 같은 부모에 누적된다.
 */
class Main5_2 {

    static int delimiterToValue(char delimiter) {
        if (delimiter == '(' || delimiter == ')') return 2;
        if (delimiter == '[' || delimiter == ']') return 3;
        return -1;
    }

    static boolean isMatchedDelimiter(char openDelimiter, char closeDelimiter) {
        if (openDelimiter == '(' && closeDelimiter == ')') return true;
        else if (openDelimiter == '[' && closeDelimiter == ']') return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = sc.next().toCharArray();
        Status[] stack = new Status[31];
        int topIndex = -1;
        stack[++topIndex] = new Status(' ');
        for (char ch : input) {
            if (ch == '(' || ch == '[') {
                stack[++topIndex] = new Status(ch);
            } else {
                if (topIndex < 0 || !isMatchedDelimiter(stack[topIndex].openDelimiter, ch)) {
                    stack[0].innerSum = 0;
                    break;
                }
                int score = stack[topIndex].innerSum * delimiterToValue(ch);
                if (score == 0) score = delimiterToValue(ch);
                stack[--topIndex].innerSum += score;
            }
        }
        System.out.println(topIndex == 0 ? stack[topIndex].innerSum : 0);
    }
}

/**
 * 풀이 3 : 풀이를 다시보면 점수에 반영되는 값은 1번 규칙의 '()'와 '[]'가 변형된 것이다. 해당 값에 영향을 끼치는 조상괄호만 남겨보자.
 * - 조상 괄호로 인한 누적곱을 관리한다. 점수괄호가 나왔을 때 누적곱을 통해 실제 더해질 값을 구할 수 있다.
 * - 분배법칙을 통해 점수괄호를 각 항으로 나누어 더할 수 있다.
 */
class Main5_3 {

    static int delimiterToValue(char delimiter) {
        if (delimiter == '(' || delimiter == ')') return 2;
        if (delimiter == '[' || delimiter == ']') return 3;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();

        int[] stack = new int[input.length];
        int topIndex = -1;
        int currentMultiple = 1;
        int ans = 0;
        for (int i = 0; i < input.length; i++) {
            int delimiterValue = delimiterToValue(input[i]);
            if (input[i] == '(' || input[i] == '[') {
                stack[++topIndex] = delimiterValue;
                currentMultiple *= delimiterValue;
            } else {
                if (topIndex < 0 || stack[topIndex--] != delimiterValue) {
                    ans = 0;
                    break;
                }
                if (input[i - 1] == '(' || input[i - 1] == '[')
                    ans += currentMultiple;
                currentMultiple /= delimiterValue;
            }
        }
        System.out.println(topIndex < 0 ? ans : 0);
    }
}
