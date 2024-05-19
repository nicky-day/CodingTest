package org.example.priority_queue.programmers;

import java.util.*;

class 디스크_컨트롤러 {
    private static class Job {
        public final int start;
        public final int duration;

        private Job(int start, int duration) {
            this.start = start;
            this.duration = duration;
        }
    }

    public int solution(int[][] rawJobs) {
        Job[] jobs = new Job[rawJobs.length];
        for (int i = 0; i < rawJobs.length; i++) {
            jobs[i] = new Job(rawJobs[i][0], rawJobs[i][1]);
        }
        Arrays.sort(jobs, Comparator.comparingInt(job -> job.start));

        Queue<Job> q = new LinkedList<>(Arrays.asList(jobs));
        PriorityQueue<Job> pq = new PriorityQueue<>(Comparator.comparingInt(job -> job.duration));

        int exec = 0;       // 작업의 요청 시간부터 종료 시간까지 누적합
        int time = 0;       // 현재 시간

        while (!q.isEmpty() || !pq.isEmpty()) {
            // 작업 처리
            while (!q.isEmpty() && q.peek().start <= time) {
                pq.add(q.poll());
            }

            if (pq.isEmpty()) {
                time = q.peek().start;
                continue;
            }

            Job job = pq.poll();
            exec += time + job.duration - job.start;
            time += job.duration;
        }

        return exec / jobs.length;
    }
}

class Main2 {
    public static void main(String[] args) {
        디스크_컨트롤러 problem = new 디스크_컨트롤러();
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(problem.solution(jobs));
    }
}
