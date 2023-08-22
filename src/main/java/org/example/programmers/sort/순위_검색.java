package org.example.programmers.sort;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class 순위_검색 {

    private Map<String, List<Integer>> buildScoresMap(String[] info) {
        Map<String, List<Integer>> scoresMap = new HashMap<>();

        // 전처리
        for (String s : info) {
            String[] tokens = s.split("");
            int score = Integer.parseInt(tokens[tokens.length - 1]);
            // scoresMap에 추가
        }

        return scoresMap;
    }

    private void forEachKey(int index, String prefix, String[] tokens) {
        if (index == tokens.length - 1) {
            // prefix가 만들어진 검색 조건
            return;
        }
    }
}

class Main133 {
    public static void main(String[] args) {
        String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};

    }
}
