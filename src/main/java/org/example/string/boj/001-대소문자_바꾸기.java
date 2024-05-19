package org.example.string.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class 대소문자_바꾸기 {
}

class Main1_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        StringBuilder builder = new StringBuilder();
        for (char c : word.toCharArray()) {
            builder.append(
                    Character.isLowerCase(c)
                            ? Character.toUpperCase(c)
                            : Character.toLowerCase(c));
        }
        System.out.println(builder.toString());
    }
}

class Main1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ans = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= ans[i] && ans[i] <= 'z')
                ans[i] = (char)('A' + ans[i] - 'a');
            else ans[i] = (char)('a' + ans[i] - 'A');
        }
        System.out.println(ans);
    }
}
