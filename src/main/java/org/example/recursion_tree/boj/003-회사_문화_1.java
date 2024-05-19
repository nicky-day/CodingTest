package org.example.recursion_tree.boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class 회사_문화_1 {
}

class Main3 {

    public static int[] parent;
    public static int[] like;
    public static List<Integer>[] tree;

    public static void next(int node) {
        for (int child : tree[node]) {
            like[child] += like[node];
            next(child);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        parent = new int[n + 1];
        like = new int[n + 1];
        tree = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
            parent[i] = sc.nextInt();

            if (parent[i] != -1) {
                tree[parent[i]].add(i);
            }
        }

        for (int i = 0; i < m; i++) {
            int employee = sc.nextInt();
            int point = sc.nextInt();
            like[employee] += point;
        }

        next(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(like[i]).append(" ");
        }
        System.out.println(sb);
    }
}
