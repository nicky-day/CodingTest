package org.example.array.programmers;

import java.util.Arrays;

class 거리두기_확인하기 {

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < answer.length; i++) {
            String[] place = places[i];
            char[][] room = new char[place.length][];
            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
            // 거리두기 검사 후 answer에 기록
            if (isDistanced(room)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }

        }
        return answer;
    }

    // 해당 대기실이 거리두기를 지키고 있는지 검사
    private boolean isDistanced(char[][] room) {
        // 대기실의 모든 응시자 위치에 반복
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                // 응시자가 앉아 있지 않은 위치는 검사를 할 필요가 없으므로 건너뛴다.
                if (room[y][x] != 'P') continue;
                // 거리두기 검사
                if (!isDistanced(room, x, y)) return false;
            }
        }
        return true;
    }

    // 상, 좌, 우, 하 : 방향 인덱스가 상 - 0, 하 - 3, 좌 - 1, 우 - 2, 반대방향 인덱스끼리 더하면 3이 된다
    private static final int dx[] = {0, -1, 1, 0};
    private static final int dy[] = {-1, 0, 0, 1};

    // 해당 대기실에서 (x, y) 위치의 응시자가 거리두기를 지키고 있는지 검사
    private boolean isDistanced(char[][] room, int x, int y) {
        // room[y][x]가 거리두기를 지키는지 검사
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) continue;
            // room[nx][ny]를 통해 다른 응시자에게 도달할 수 있는지 검사
            switch (room[ny][nx]) {
                case 'P': return false;     // 응시자일 경우, 맨해튼 거리 1에 다른 응시자가 있는 것
                case 'O':
                    // 인접한 곳에 다른 응시자가 있는직 검사
                    if (isNextToVolunterr(room, nx, ny, 3-d)) return false;
            }
        }
        return true;
    }

    /**
     *  여기서 인접한 곳은, 다시 상하좌우를 의미한다.
     *  그러나 원래 검사를 시작했던 응시자는 제외해야 하기 때문에 해당 방향으로는 검사를 수행하지 않는다.
     *  따라서 검사를 검사를 제외할 방향도 같이 넘겨줘야 한다.
     *  exclude 방향을 제외한 네 방향에 다른 응시자가 있는지 검사한다.
     */
    private boolean isNextToVolunterr(char[][] room, int x, int y, int exclude) {
        for (int d = 0; d < 4; d++) {
            if (d == exclude) continue;
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) continue;
            if (room[ny][nx] == 'P') return true;
        }
        return false;
    }
}

class Main3 {
    public static void main(String[] args) {
        거리두기_확인하기 problem = new 거리두기_확인하기();
        String[][] places =
                {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        System.out.println(Arrays.toString(problem.solution(places)));
    }
}
