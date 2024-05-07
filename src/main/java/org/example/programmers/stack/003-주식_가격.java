package org.example.programmers.stack;

import java.util.Arrays;
import java.util.Stack;

class 주식_가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                answer[index] = i - index;
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = prices.length - index - 1;
        }

        return answer;
    }
}

class Main3 {
    public static void main(String[] args) {
        주식_가격 problem = new 주식_가격();
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(problem.solution(prices)));
    }
}
