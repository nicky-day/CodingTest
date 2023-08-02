package org.example.programmers.introduction;

class 칠의_개수 {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String str = String.valueOf(array[i]);
            for (int j = 0; j < str.length(); j++) {
                if (Character.toString(str.charAt(j)).equals("7")) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}

class Main85 {
    public static void main(String[] args) {
        칠의_개수 problem = new 칠의_개수();
        int[] array = {7, 77, 17};
        System.out.println(problem.solution(array));
    }
}
