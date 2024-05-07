package org.example.boj.string;

class 단어_공부 {
    public char solution(String word) {
        word = word.toLowerCase();
        int[] array = new int[26];
        for (char c : word.toCharArray()) {
            array[c - 97] += 1;
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            } else if (array[i] == max) {
                System.out.println(i);
                return '?';
            }
        }
        return (char) (maxIndex + 65);
    }

    public void solution2(String str) {
        str = str.toUpperCase();
        int[] count = getAlphabetCount(str);

        int maxCount = -1;
        char maxAlphabet = '?';
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char) ('A' + i);
            } else if (count[i] == maxCount) {
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }

    public int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }
        return count;
    }
}

class Main160 {
    public static void main(String[] args) {
        단어_공부 problem = new 단어_공부();
        String word = "Mississipi";
        problem.solution2(word);
    }
}
