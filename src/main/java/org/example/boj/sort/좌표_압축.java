package org.example.boj.sort;

import java.io.*;
import java.util.*;

class 좌표_압축 {
}

// comparator
class Main223 {
    /**
     * 1. 입력된 좌표를 작은 순으로 정렬한다.
     * 2. 정렬된 좌표를 중복을 제거하여 압축된 인덱스를 기록한다.
     * 3. 입력된 좌표에 알맞는 압축 인덱스를 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[][] xs = new int[N][2];
        for (int i = 0; i < N; i++) {
            xs[i][0] = Integer.parseInt(input[i]);
            xs[i][1] = i;
        }

        Arrays.sort(xs, Comparator.comparingInt(o -> o[0]));

        int[] ans = new int[N];
        int idx = 0;
        ans[xs[0][1]] = idx;
        for (int i = 1; i < N; i++) {
            // 중복 제거
            if (xs[i][0] != xs[i - 1][0]) idx++;
            ans[xs[i][1]] = idx;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++)
            bw.write(ans[i] + " ");
        bw.flush();
    }
}

// map
class Main224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        String[] input = sc.nextLine().split(" ");

        int[] xs = new int[N];
        for (int i = 0; i < N; i++) {
            xs[i] = Integer.parseInt(input[i]);
            set.add(xs[i]);
        }

        Map<Integer, Integer> sortedIndex = new HashMap<>();
        int idx = 0;
        for (int x : set) {
            sortedIndex.put(x, idx++);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(sortedIndex.get(xs[i]) + " ");
        }
    }
}
