package org.example.boj.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class 외계인의_기타_연주 {
}

class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();

        /**
         * 가장 높은 음(top)부터 차례로 떼거나(pop)
         * 가장 높은 음이 추가되는 형태로(push)
         * 각 줄에 눌려진 프렛을 스택으로 관리할 수 있다.
         */
        Deque<Integer>[] pushed = new ArrayDeque[7];
        for (int i = 1; i <= 6; i++) {
            pushed[i] = new ArrayDeque<>();
        }

        int moveCount = 0;
        for (int i = 0; i < N; i++) {
            int line = sc.nextInt();
            int fret = sc.nextInt();
            while (!pushed[line].isEmpty()) {
                /**
                 * 가장 높은 프렛이 연주하려는 프렛보다 높다면
                 * 원하는 프렛이 가장 높은 음이 될 수 있을 때까지
                 * 오름차순 스택에서 top을 제거한다.
                 */
                if (pushed[line].peekLast() > fret) {
                    pushed[line].pollLast();
                    moveCount++;
                }
                else break;
            }
            if (!pushed[line].isEmpty() && pushed[line].peekLast() == fret) continue;
            /**
             * 지금 연주하려는 음이 가장 높은 음이므로
             * 스택에 추가해도 오름차순이 유지된다.
             */
            pushed[line].offerLast(fret);
            moveCount++;
        }

        System.out.println(moveCount);
    }
}
