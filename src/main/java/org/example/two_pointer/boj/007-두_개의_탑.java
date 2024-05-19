package org.example.two_pointer.boj;

import java.util.Scanner;

class 두_개의_탑 {
}

class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] distance = new int[N];
        int distanceSum = 0;
        for (int i = 0; i < N; i++) {
            distance[i] = sc.nextInt();
            distanceSum += distance[i];
        }

        int pairIndex = 1;
        int distClockWise = distance[0];
        int distCounterClockWise = distanceSum - distClockWise;
        int maxDistance = Math.min(distClockWise, distCounterClockWise);
        // 모든 기준 지점 i에서
        // 반시계방향거리 <= 시계방향거리가 되는 경계를 확인한다.
        for (int i = 0; i < N; i++) {
            while (distClockWise < distCounterClockWise) {
                distClockWise += distance[pairIndex];
                distCounterClockWise -= distance[pairIndex];
                pairIndex = (pairIndex + 1) % N;
            }
            maxDistance = Math.max(maxDistance, Math.min(distClockWise, distCounterClockWise));

            distClockWise -= distance[i];
            distCounterClockWise += distance[i];
        }

        System.out.println(maxDistance);
    }
}
