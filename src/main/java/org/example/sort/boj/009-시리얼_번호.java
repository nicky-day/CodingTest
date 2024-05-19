package org.example.sort.boj;

import java.util.Arrays;
import java.util.Scanner;

class 시리얼_번호 {
}

class Serial {
    String serial;
    int sum;

    public Serial(String serial) {
        this.serial = serial;
        this.sum = 0;
        for (char c : serial.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
    }
}

class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Serial[] serials = new Serial[N];
        for (int i = 0; i < N; i++) {
            serials[i] = new Serial(sc.next());
        }

        Arrays.sort(serials, (o1, o2) -> {
            if (o1.serial.length() != o2.serial.length())
                return o1.serial.length() - o2.serial.length();
            if (o1.sum != o2.sum)
                return o1.sum - o2.sum;
            return o1.serial.compareTo(o2.serial);
        });

        for (Serial serial : serials) {
            System.out.println(serial.serial);
        }
    }
}
