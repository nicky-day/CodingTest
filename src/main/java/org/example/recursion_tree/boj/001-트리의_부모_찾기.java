package org.example.recursion_tree.boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class 트리의_부모_찾기 {
}

class Main1 {

    public static List<Integer>[] tree;
    public static int[] parents;
    public static boolean[] check;

    public static void find(int node) {
        check[node] = true;
        for (int child : tree[node]) {
            if (!check[child]) {
                parents[child] = node;
                find(child);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            tree[node1].add(node2);
            tree[node2].add(node1);
        }

        parents = new int[n + 1];
        check = new boolean[n + 1];

        find(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(parents[i]);
        }
    }
}
