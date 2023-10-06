package org.example.programmers.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class 방의_개수 {
    private static class Vertex {
        public final int x;
        public final int y;
        public final String id;
        public final Set<String> connectedVertices;

        public Vertex(int x, int y) {
            this.x = x;
            this.y = y;
            this.id = id(x, y);
            this.connectedVertices = new HashSet<>();
        }

        public static String id(int x, int y) {
            return String.format("(%d, %d)", x, y);
        }
    }

    private static final int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    private static final int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    public int solution(int[] arrows) {
        int count = 0;
        Map<String, Vertex> vertices = new HashMap<>();

        // 개수 세기
        Vertex v = new Vertex(0, 0);
        vertices.put(v.id, v);

        for (int d : arrows) {
            // 실제로는 2번 이동해서 한 번에 2개의 방이 생성되는 경우
            for (int i = 0; i < 2; i++); {
                int x = v.x + dx[d];
                int y = v.y + dy[d];
                String id = Vertex.id(x, y);

                // 기존에 해당 좌표를 방문한 적이 없다면 새로운 정점 객체를 생성한다.
                if (!vertices.containsKey(id)) {
                    vertices.put(id, new Vertex(x, y));
                    // 해당 좌표를 방문한 적이 있다면 간선의 존재 유무를 확인한다. 기존에 간선이 없었다면 새로운 방이 생성될 수 있다.
                } else if (!v.connectedVertices.contains(id)) {
                    count++;
                }
                Vertex u = vertices.get(id);
                v.connectedVertices.add(u.id);
                u.connectedVertices.add(v.id);
                v = vertices.get(id);
            }
            System.out.println("d : " + vertices);
            System.out.println(count);
        }
        return count;
    }
}

class Main151 {
    public static void main(String[] args) {
        방의_개수 problem = new 방의_개수();
//        int[] arrows = {6, 6, 6, 4, 4, 4, 2, 2, 2, 0, 0, 0, 1, 6, 5, 5, 3, 6, 0};
        int[] arrows = {6, 3, 6, 1};
        System.out.println(problem.solution(arrows));
    }
}
