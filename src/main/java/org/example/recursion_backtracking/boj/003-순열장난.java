package org.example.recursion_backtracking.boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class 순열장난 {
}

class Main3 {

    static int[] check = new int[101];
    static char [] input;
    static int n = 0;
    static List<Integer> answer = new ArrayList<>();

    public static int atoi(char[] input, int start, int length) {
        int result = 0;
        for (int i = start; i < start + length; i++) {
            result *= 10;
            result += input[i] - '0';
        }
        return result;
    }

    public static void solve(int index) {
        // base case
        // backtrack 1 : 생성하려는 정수가 원본 문자열 인덱스를 초과하는 경우
        if (index >= input.length) {
            for (Integer num : answer) {
                System.out.print(num + " ");
            }
            System.exit(0);
        }

        // recursive case
        int target1 = atoi(input, index, 1);
        // backtrack 2 : N보다 큰 정수를 생성하려는 경우
        // backtrack 3 : 생성하려는 정수가 이전에 사용된 적이 있는 경우
        if (target1 <= n && check[target1] == 0) {
            check[target1] = 1;
            answer.add(target1);
            solve(index + 1);
            answer.remove(answer.size() - 1);
            check[target1] = 0;
        }

        // backtrack 1 : 생성하려는 정수가 원본 문자열 인덱스를 초과하는 경우
        if (index + 1 < input.length) {
            int target2 = atoi(input, index, 2);
            // backtrack 2 : N보다 큰 정수를 생성하려는 경우
            // backtrack 3 : 생성하려는 정수가 이전에 사용된 적이 있는 경우
            if (target2 <= n && check[target2] == 0) {
                check[target2] = 1;
                answer.add(target2);
                solve(index + 2);
                answer.remove(answer.size() - 1);
                check[target2] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input = sc.next().toCharArray();
        n = input.length > 9 ? 9 + (input.length - 9) / 2 : input.length;
        solve(0);
    }
}
