package org.example.array.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

class 성_지키기 {
}

class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] size = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = size[0];
        int m = size[1];

        String[][] castle = new String[n][m];

        for (int i = 0; i < n; i++) {
            castle[i] = br.readLine().split("");
        }

        int xNeeded = 0;
        for (int i = 0; i < n; i++) {
            int security = 0;
            for (int j = 0; j < m; j++) {
                if (Objects.equals(castle[i][j], "X")) {
                    security++;
                }
            }
            if (security == 0) {
                xNeeded += 1;
            }
        }

        int yNeeded = 0;
        for (int i = 0; i < m; i++) {
            int security = 0;
            for (int j = 0; j < n; j++) {
                if (Objects.equals(castle[j][i], "X")) {
                    security++;
                }
            }
            if (security == 0) {
                yNeeded += 1;
            }
        }

        System.out.println(Math.max(xNeeded, yNeeded));
    }
}
