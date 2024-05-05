package org.example.boj.sort;

import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class 회사에_있는_사람 {
}

// Map
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

// Set
class Main258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> entered = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            String status = sc.next();
            if (status.equals("enter"))
                entered.add(name);
            else entered.remove(name);
        }

        String[] orderedAnswer = entered.toArray(new String[entered.size()]);
        for (int i = orderedAnswer.length - 1; i >= 0; i--) {
            System.out.println(orderedAnswer[i]);
        }
    }
}
