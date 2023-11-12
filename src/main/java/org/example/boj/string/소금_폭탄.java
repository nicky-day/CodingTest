package org.example.boj.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class 소금_폭탄 {
    public String solution(String input1, String input2) {
        String[] t1 = input1.split(":");
        String[] t2 = input2.split(":");

        int s1 = 0;
        int s2 = 0;

        s1 += Integer.parseInt(t1[0]) * 60 * 60;
        s1 += Integer.parseInt(t1[1]) * 60;
        s1 += Integer.parseInt(t1[2]);

        s2 += Integer.parseInt(t2[0]) * 60 * 60;
        s2 += Integer.parseInt(t2[1]) * 60;
        s2 += Integer.parseInt(t2[2]);

        if (s1 >= s2) {
            s2 += 24 * 60 * 60;
        }

        int diff = s2 - s1;

        int time = 0;
        int minute = 0;
        int second = 0;

        int temp = 0;
        time = diff / (60 * 60);
        temp = diff % (60 * 60);
        minute = temp / 60;
        second = temp % 60;

        String resTime = String.format("%02d", time);
        String resMinute = String.format("%02d", minute);
        String resSecound = String.format("%02d", second);

        return resTime + ":" + resMinute + ":" + resSecound;
    }

}

class Main162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();
        String[] t1 = input1.split(":");
        String[] t2 = input2.split(":");

        int s1 = 0;
        int s2 = 0;

        s1 += Integer.parseInt(t1[0]) * 60 * 60;
        s1 += Integer.parseInt(t1[1]) * 60;
        s1 += Integer.parseInt(t1[2]);

        s2 += Integer.parseInt(t2[0]) * 60 * 60;
        s2 += Integer.parseInt(t2[1]) * 60;
        s2 += Integer.parseInt(t2[2]);

        if (s1 >= s2) {
            s2 += 24 * 60 * 60;
        }

        int diff = s2 - s1;

        int time = 0;
        int minute = 0;
        int second = 0;

        int temp = 0;
        time = diff / (60 * 60);
        temp = diff % (60 * 60);
        minute = temp / 60;
        second = temp % 60;

        String resTime = String.format("%02d", time);
        String resMinute = String.format("%02d", minute);
        String resSecound = String.format("%02d", second);

        System.out.println(resTime + ":" + resMinute + ":" + resSecound);
    }
}
