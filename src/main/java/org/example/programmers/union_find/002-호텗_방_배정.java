package org.example.programmers.union_find;

import java.util.*;

class 호텗_방_배정 {
    private static class Node {
        private int depth = 1;
        private Node parent = null;

        private long max;

        public Node(long value) {
            max = value;
        }

        public boolean isConnected(Node o) {
            return root() == o.root();
        }

        public long max() {
            return root().max;
        }

        public void merge(Node o) {
            if (isConnected(o)) return;

            Node root1 = root();
            Node root2 = o.root();

            if (root1.depth > root2.depth) {
                root2.parent = root1;
            } else if (root1.depth < root2.depth) {
                root1.parent = root2;
            } else {
                root2.parent = root1;
                root1.depth += 1;
            }

            root1.max = root2.max = Math.max(root1.max, root2.max);
        }

        private Node root() {
            if (parent == null) return this;
            return parent.root();
        }
    }

    public long[] solution(long k, long[] room_number) {
        List<Long> assigned = new ArrayList<>();

        Map<Long, Node> nodes = new HashMap<>();

        // 유니온 파인드 수행
        for (long number : room_number) {
            if (nodes.containsKey(number)) {
                number = nodes.get(number).max() + 1;
            }

            Node node = new Node(number);
            nodes.put(number, node);
            if (nodes.containsKey(number - 1)) {
                node.merge(nodes.get(number - 1));
            }
            if (nodes.containsKey(number + 1)) {
                node.merge(nodes.get(number + 1));
            }

            // number 방 실제 배정하기
            assigned.add(number);
        }

        return assigned.stream().mapToLong(Long::longValue).toArray();
    }
}

class Main2 {
    public static void main(String[] args) {
        호텗_방_배정 problem = new 호텗_방_배정();
        long k = 10;
        long[] room_number = {1, 3, 4, 1, 3, 1};
        System.out.println(Arrays.toString(problem.solution(k, room_number)));
    }
}
