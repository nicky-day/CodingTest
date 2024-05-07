package org.example.boj.brute_force;

class 셀프_넘버 {
}

class Main31 {
    public static void main(String[] args) {
        // 1부터 10000까지의 셀프 넘버를 구하는 문제이지만 셀프 넘버가
        // 아닌 수를 구하는 방식으로 풀었다.
        boolean[] isSelfNumber = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            int num = i;
            sum += num;
            while (num != 0) {
                sum += num % 10;
                num = num / 10;
            }
            if (sum > 10000) continue;
            isSelfNumber[sum] = true;
        }

        for (int i = 1; i <= 10000; i++) {
            if (!isSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }
}
