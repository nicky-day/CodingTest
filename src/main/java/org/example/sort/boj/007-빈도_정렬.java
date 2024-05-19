package org.example.sort.boj;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class 빈도_정렬 {
    /**
     * N개의 수가 주어질 때 아래 조건에 맞게 정렬
     * 1. 더 많이 등장한 숫자 먼저
     * 2. 등장 횟수가 같다면 입력으로 먼저 들어온 것이 먼저
     */
}

class Message {
    int num;
    int idx;
    public Message(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }
}

class Frequency {
    int num;
    int count;
    int firstIndex;

    public Frequency(int num, int count, int firstIndex) {
        this.num = num;
        this.count = count;
        this.firstIndex = firstIndex;
    }
}

// Two Pointer
class Main7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();

        Message[] messages = new Message[N];
        for (int i = 0; i < N; i++) {
            messages[i] = new Message(sc.nextInt(), i);
        }

        // 오름차순으로 정렬
        Arrays.sort(messages, (o1, o2) -> o1.num - o2.num);

        Frequency[] frequencies = new Frequency[N];
        frequencies[0] = new Frequency(messages[0].num, 1, messages[0].idx);
        int frequencyIndex = 0;   // frequencyIndex는 지금 빈도를 세고 있는 index
        for (int i = 1; i < N; i++) {
            if (frequencies[frequencyIndex].num == messages[i].num) {
                frequencies[frequencyIndex].count++;
            } else {
                frequencies[++frequencyIndex] = new Frequency(messages[i].num, 1, messages[i].idx);
            }
        }

        // frequencies를 N칸으로 생성했으나 실제 유효한 원소는 frequencyIndex + 1개이다.
        Arrays.sort(frequencies, 0, frequencyIndex + 1, (o1, o2) -> {
            if (o1.count == o2.count) {
                return o1.firstIndex - o2.firstIndex;
            }
            return o2.count - o1.count;
        });

        for (int i = 0; i <= frequencyIndex; i++) {
            while (frequencies[i].count-- > 0) {
                System.out.print(frequencies[i].num + " ");
            }
        }
    }
}

// LinkedHashMap
class Main7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();

        Map<Integer, Integer> messages = new LinkedHashMap<>();   // 순서 보장
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            messages.put(num, messages.getOrDefault(num, 0) + 1);
        }

        Integer[] frequencies = messages.keySet().toArray(new Integer[messages.size()]);
        Arrays.sort(frequencies, (o1, o2) -> messages.get(o2) - messages.get(o1));

        for (int frequency : frequencies) {
            int count = messages.get(frequency);
            while(count-- > 0) {
                System.out.print(frequency + " ");
            }
        }
    }
}
