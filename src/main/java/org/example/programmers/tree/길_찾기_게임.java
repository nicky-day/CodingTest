package org.example.programmers.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 길_찾기_게임 {
    private static class Node {
        public final int value;
        public final int x;
        public final int y;

        public Node left;
        public Node right;

        private Node(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }

    private void insert(Node root, Node node) {
        // x 좌표에 따라 root 노드가 나타내는 트리에 node 삽입

        // 왼쪽 서브트리에 삽입
        if (node.x < root.x) {
            if (root.left == null) {
                root.left = node;
            } else {
                insert(root.left, node);
            }
        // 오른쪽 서브트리에 삽입
        } else {
            if (root.right == null) {
                root.right = node;
            } else {
                insert(root.right, node);
            }
        }
    }

    // 노드의 배열을 전달받아 루트 노드를 반환한다.
    private Node constructTree(Node[] nodes) {
        Node root = nodes[0];

        // 트리 구성
        for (int i = 1; i < nodes.length; i++) {
            insert(root, nodes[i]);
        }

        return root;
    }

    // 전위 순회를 하면서 방문하는 노드값을 기록한다.
    private void pre(Node node, List<Integer> visits) {
        if (node == null) return;

        visits.add(node.value);
        pre(node.left, visits);
        pre(node.right, visits);
    }

    // 후위 순회를 하면서 방문하는 노드값을 기록한다.
    private void post(Node node, List<Integer> visits) {
        if (node == null) return;

        post(node.left, visits);
        post(node.right, visits);
        visits.add(node.value);
    }

    public int[][] solution(int[][] nodeInfo) {
        Node[] nodes = new Node[nodeInfo.length];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node(i + 1, nodeInfo[i][0], nodeInfo[i][1]);
        }

        // 트리의 윗부분부터 순회하기 위해 y 좌표로 내림차순 정렬을 한다.
        Arrays.sort(nodes, (a, b) -> b.y - a.y);

        Node root = constructTree(nodes);

        List<Integer> preorder = new ArrayList<>();
        pre(root, preorder);

        List<Integer> postorder = new ArrayList<>();
        post(root, postorder);

        return new int[][]{
                preorder.stream().mapToInt(Integer::intValue).toArray(),
                postorder.stream().mapToInt(Integer::intValue).toArray(),
        };
    }
}

class Main152 {
    public static void main(String[] args) {
        길_찾기_게임 problem = new 길_찾기_게임();
        int[][] nodeInfo = {{5, 3}, {11, 5}, {13, 3}, {3, 5}, {6, 1}, {1, 3}, {8, 6}, {7, 2}, {2, 2}};
        System.out.println(Arrays.deepToString(problem.solution(nodeInfo)));
    }
}
