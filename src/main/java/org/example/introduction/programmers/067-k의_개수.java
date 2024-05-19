package org.example.introduction.programmers;

class k의_개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int t = i; t <= j; t++ ){
            StringBuilder sb = new StringBuilder();
            sb.append(t);

            for (int r = 0; r < sb.length(); r++) {
                if (sb.charAt(r) - '0' == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}

class Main67 {
    public static void main(String[] args) {
        k의_개수 problem = new k의_개수();
        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(problem.solution(i, j, k));
    }
}
