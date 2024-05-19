package org.example.programmers.graph;

import java.util.Arrays;

class 순위 {
    private int countForward(int u, boolean[][] graph, boolean[] isVisited) {
        int count = 1;

        for (int v = 0; v < graph[u].length; v++) {
            if (!graph[u][v] || isVisited[v]) continue;
            isVisited[v] = true;
            count += countForward(v, graph, isVisited);
        }
        return count;
    }

    private int countBackward(int u, boolean[][] graph, boolean[] isVisited) {
        int count = 1;

        for (int v = 0; v < graph.length; v++) {
            if (!graph[v][u] || isVisited[v]) continue;
            isVisited[v] = true;
            count += countBackward(v, graph, isVisited);
        }
//        System.out.println("v : " + v + "");
        return count;
    }

    public int solution (int n, int[][] results) {
        boolean[][] graph = new boolean[n][n];
        for (int[] edge : results) {
            int u = edge[0] - 1;         // 선수 번호가 1부터 시작
            int v = edge[1] - 1;
            graph[u][v] = true;
        }
        System.out.println(Arrays.deepToString(graph));

        int count = 0;
        for (int u = 0; u < n; u++) {
            int wins = countForward(u, graph, new boolean[n]) - 1;
            int loses = countBackward(u, graph, new boolean[n]) - 1;
            if (wins + loses + 1 == n) {
                count++;
            }
        }
        return count;
    }
}

class Main1 {
    public static void main(String[] args) {
        순위 problem = new 순위();
        int n = 5;
        int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
        System.out.println(problem.solution(n, results));
    }
}
