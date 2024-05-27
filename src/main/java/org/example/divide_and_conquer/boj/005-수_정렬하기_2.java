package org.example.divide_and_conquer.boj;

import java.util.Scanner;

class 수_정렬하기_2 {
}

class Main5 {

    public static int n;
    public static int[] numbers;
    public static int[] temp;

    public static void divide(int start, int end) {
        if (start == end) return;
        int mid = (start + end) / 2;
        divide(start, mid);
        divide(mid + 1, end);
        combine(start, end);
    }

    public static void combine(int start, int end) {
        int mid = (start + end) / 2;
        int left = start;
        int right = mid + 1;
        int newIdx = start;

        while (left <= mid && right <= end) {
            if (numbers[left] < numbers[right]) {
                temp[newIdx++] = numbers[left++];
            } else {
                temp[newIdx++] = numbers[right++];
            }
        }

        while (left <= mid) {
            temp[newIdx++] = numbers[left++];
        }

        while (right <= end) {
            temp[newIdx++] = numbers[right++];
        }

        for (int i = start; i <= end; i++) {
            numbers[i] = temp[i];
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        numbers = new int[n];
        temp = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        divide(0, n - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(numbers[i]).append("\n");
        }
        System.out.println(sb);
    }
}
