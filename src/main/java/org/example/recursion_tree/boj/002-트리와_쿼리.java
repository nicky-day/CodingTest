package org.example.recursion_tree.boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class 트리와_쿼리 {
}

class Main2 {

    public static List<Integer>[] tree;
    public static boolean[] check;
    public static int[] sum;

    public static int getSum(int node) {
        if (sum[node] != 0) return sum[node];
        check[node] = true;
        int result = 1;   // 자기 자신
        for (int child : tree[node]) {
            if (!check[child]) {
                result += getSum(child);
            }
        }
        return sum[node] = result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int q = sc.nextInt();
        check = new boolean[n + 1];
        sum = new int[n + 1];
        tree = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }
        sum[r] = getSum(r);
        for (int i = 0; i < q; i++) {
            int query = sc.nextInt();
            System.out.println(sum[query]);
        }
    }
}
