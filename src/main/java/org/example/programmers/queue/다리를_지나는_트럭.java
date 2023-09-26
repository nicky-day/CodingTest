package org.example.programmers.queue;

import java.util.LinkedList;
import java.util.Queue;

class 다리를_지나는_트럭 {
    public int solution(int bridegeLength, int weight, int[] truckWeights) {
        int bridgeWeight = 0;   // 다리 무게
        Queue<Integer> bridge = new LinkedList<>();     // 다리

        for (int i = 0; i < bridegeLength; i++) {
            bridge.add(0);
        }

        int time = 0;               // 소요된 시간
        int truckIndex = 0;         // 대기 중인 트럭의 인덱스
        while (truckIndex < truckWeights.length) {
            // 트럭 처리
            bridgeWeight -= bridge.poll();
            int truckWeight = truckWeights[truckIndex];
            if (bridgeWeight + truckWeight <= weight) {
                bridge.add(truckWeight);
                bridgeWeight += truckWeight;
                truckIndex++;
            } else {
                bridge.add(0);
            }
            time++;
        }

        while (bridgeWeight > 0) {
            bridgeWeight -= bridge.poll();
            time++;
        }

        return time;
    }
}

class Main149 {
    public static void main(String[] args) {
        다리를_지나는_트럭 problem = new 다리를_지나는_트럭();
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(problem.solution(bridge_length, weight, truck_weights));
    }
}
