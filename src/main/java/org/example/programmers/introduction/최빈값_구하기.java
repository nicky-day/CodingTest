package org.example.programmers.introduction;

class 최빈값_구하기 {
    public int solution(int[] array) {
        int answer = 0;
        int arr_max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > arr_max) {
                arr_max = array[i];
            }
        }

        int[] list = new int[arr_max + 1];
        for (int i = 0; i < list.length; i++) {
            list[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            list[array[i]] += 1;
        }

        int max = 0;
        int n = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
                answer = i;
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] == max) {
                n++;
            }
        }

        if (n > 1) {
            answer = -1;
        }

        return answer;
    }
}

class Main104 {
    public static void main(String[] args) {
        최빈값_구하기 problem = new 최빈값_구하기();
        int[] array = {1, 2, 3, 3, 3, 4};
        System.out.println(problem.solution(array));
    }
}
