package org.example.recursion.boj;

import java.util.Scanner;

class 부분수열의_합 {
}

class Main2 {

    public static int[] numbers;
    public static int s;
    public static int answer = 0;

    public static void solve(int index, int sum) {
        // base case
        if (index == numbers.length) return;
        if (sum + numbers[index] == s) answer++;

        // recursive case
        solve(index + 1, sum);
        solve(index + 1, sum + numbers[index]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s = sc.nextInt();
        numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        solve(0, 0);
        System.out.println(answer);
    }
}
