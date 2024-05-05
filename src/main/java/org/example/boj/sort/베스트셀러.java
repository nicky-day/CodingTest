package org.example.boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class 베스트셀러 {
}

class Main178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            map.put(input, map.getOrDefault(input, 1) + 1);
        }

        List<String> keyList = new ArrayList<>(map.keySet());
        keyList.sort((s1, s2) -> {
            if (Objects.equals(map.get(s1), map.get(s2))) {
                return s1.compareTo(s2);
            } else {
                return map.get(s2) - map.get(s1);
            }
        });

        System.out.println(keyList.get(0));
    }
}

class Main259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] titles = new String[N];
        for (int i = 0; i < N; i++) {
            titles[i] = sc.next();
        }
        Arrays.sort(titles);

        String maxTitle = titles[0];
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 1; i < N; i++) {
            if (!titles[i].equals(titles[i - 1])) {
                currentCount = 0;
            }
            currentCount++;
            if (maxCount < currentCount ||
                    (maxCount == currentCount && titles[i].compareTo(maxTitle) < 0)) {
                maxCount = currentCount;
                maxTitle = titles[i];
            }
        }
        System.out.println(maxTitle);
    }
}
