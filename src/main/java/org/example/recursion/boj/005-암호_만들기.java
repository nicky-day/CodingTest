package org.example.recursion.boj;

import java.util.Arrays;
import java.util.Scanner;

class 암호_만들기 {
}

class Main5 {

    public static int l;
    public static int c;
    public static char[] input;
    public static char[] password;

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void generate(int length, int index, int vowelCount) {
        // base case
        if (length == l) {
            if (vowelCount >= 1 && l - vowelCount >= 2) {
                System.out.println(password);
            }
            return;
        }
        // recursive case
        if (index < c) {
            password[length] = input[index];
            int v = isVowel(input[index]) ? 1 : 0;
            generate(length + 1, index + 1, vowelCount + v);

            password[length] = 0;
            generate(length, index + 1, vowelCount);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        c = sc.nextInt();

        input = new char[c];
        password = new char[l];

        for (int i = 0; i < c; i++) {
            input[i] = sc.next().charAt(0);
        }
        Arrays.sort(input);
        generate(0, 0, 0);
    }
}
