package org.example.simulation.boj;

import java.util.Arrays;
import java.util.Scanner;

class 행운의_바퀴 {
}

class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // 바퀴의 칸 수
        int K = sc.nextInt();       // 바퀴를 돌리는 횟수
        char[] ans = new char[N];
        Arrays.fill(ans, '?');

        int curIndex = 0;
        while (K-- > 0) {
            int backStep = sc.nextInt();
            char backAlphabet = sc.next().charAt(0);
            int nextIndex = ((curIndex - backStep) % N + N) % N;   // 자바의 음수 모듈러
            if (ans[nextIndex] == '?') ans[nextIndex] = backAlphabet;
            else if (ans[nextIndex] != backAlphabet) {
                System.out.println("!");
                return;
            }
            curIndex = nextIndex;
        }

        // 똑같은 알파벳이 2번 이상 등장했는지 체크
        boolean[] chk = new boolean[26];
        for (int i = 0; i < N; i++) {
            if (ans[i] == '?') continue;
            if (chk[ans[i] - 'A']) {
                System.out.println("!");
                return;
            }
            chk[ans[i] - 'A'] = true;
        }

        // 바퀴의 알파벳을 출력
        for (int i = 0; i < N; i++) {
            System.out.print(ans[(curIndex + i) % N]);
        }
    }
}
