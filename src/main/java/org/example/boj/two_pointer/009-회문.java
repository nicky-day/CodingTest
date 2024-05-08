package org.example.boj.two_pointer;

import java.util.Scanner;

class 회문 {
}

class Main9 {

    static boolean isPalindrome(char[] s, int l, int r) {
        while (l <= r) {
            if (s[l] != s[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            char[] s = sc.next().toCharArray();
            // 1. 그 자체로 회문이라면 0
            // 2. 한 글자를 삭제해 회문으로 만들 수 있다면 1
            // 3. 둘 모두 아니면 2
            int l = 0;
            int r = s.length - 1;
            int ans = 0;
            while (l <= r) {
                if (s[l] != s[r]) {
                    if (isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1)) {
                        ans = 1;
                    } else {
                        ans = 2;
                    }
                    break;
                }
                l++;
                r--;
            }
            System.out.println(ans);
        }
    }
}
