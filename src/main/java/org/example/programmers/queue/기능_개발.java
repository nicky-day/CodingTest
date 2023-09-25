package org.example.programmers.queue;

import java.util.*;

class 기능_개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            q.add(i);
        }

        List<Integer> result = new ArrayList<>();
        int days = 0;
        int count = 0;

        while (!q.isEmpty()) {
            int index = q.poll();
            // index 번째의 작업 검사
            int expiration = (int) Math.ceil((double) (100 - progresses[index]) / speeds[index]);
            if (expiration > days) {
                if (days != 0) {
                    result.add(count);
                    count = 0;
                }
                days = expiration;
            }
            count++;
        }
        result.add(count);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}

class Main148 {
    public static void main(String[] args) {
        기능_개발 problem = new 기능_개발();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(problem.solution(progresses, speeds)));
    }
}
