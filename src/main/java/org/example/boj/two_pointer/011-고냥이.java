package org.example.boj.two_pointer;

import java.util.Scanner;

class 고냥이 {
}

class Main11_1 {

    static int getAlphabetCount(int[] alphabetFrequency) {
        int uniqueAlphabetCount = 0;
        for (int i = 0; i < alphabetFrequency.length; i++) {
            if (alphabetFrequency[i] > 0)
                uniqueAlphabetCount++;
        }
        return uniqueAlphabetCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] nyang = sc.next().toCharArray();
        int L = nyang.length;

        // 부분문자열의 시작점 각 i에 대해
        // 알파벳 종류가 N개 이하인 가장 긴 j를 찾는다.
        int nextIndex = 0;
        int[] alphabetFrequency = new int[26];
        int ans = 0;
        for (int i = 0; i < L; i++) {
            while (nextIndex < L) {
                alphabetFrequency[nyang[nextIndex++] - 'a']++;
                if (getAlphabetCount(alphabetFrequency) > N) {
                    alphabetFrequency[nyang[--nextIndex] - 'a']--;
                    break;
                }
            }
            ans = Math.max(ans, nextIndex - i);
            alphabetFrequency[nyang[i] - 'a']--;
        }

        System.out.println(ans);
    }
}
