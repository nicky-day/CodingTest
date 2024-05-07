package org.example.boj.sort;

import java.util.Arrays;
import java.util.Scanner;

class 회의실_배정 {
    /**
     * N개의 회의 시간이 주어질 때, 한 회의실에서 진행될 수 있는 최대 회의 개수
     * 1. 회의를 종료시간이 빠른 순으로 정렬한다.
     *  1-1. 종료시간이 같다면 시작시간이 빠른 순으로 정렬한다.(시작과 동시에 끝나는 회의를 뒤로)
     * 2. 가능한 회의부터 차례대로 진행한다.
     */
}

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Meeting[] meetings = new Meeting[N];
        for (int i = 0; i < N; i++) {
            meetings[i] = new Meeting(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(meetings, (o1, o2) -> {
            if (o1.end == o2.end) {
                return o1.start - o2.start;
            }
            return o1.end - o2.end;
        });

        int cnt = 0;
        int ended = 0;    // 회의가 종료된 시간
        for (Meeting meeting : meetings) {
            if (meeting.start >= ended) {   // 시작시간이 마지막 종료시간 이후라면 배치 가능
                cnt++;
                ended = meeting.end;
            }
        }
        System.out.println(cnt);
    }
}
