package org.example.leetcode.string;

class Reverse_String {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left += 1;
            right -= 1;
        }
    }
}

class Main126 {
    public static void main(String[] args) {
        Reverse_String problem = new Reverse_String();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        problem.reverseString(s);
    }
}
