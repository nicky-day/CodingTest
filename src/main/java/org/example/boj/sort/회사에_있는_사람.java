package org.example.boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class 회사에_있는_사람 {
}

class Main177 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            map.put(input[0], input[1]);
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort(Collections.reverseOrder());

        keySet.stream()
                .filter(x -> Objects.equals(map.get(x), "enter"))
                .forEach(System.out::println);
    }
}
