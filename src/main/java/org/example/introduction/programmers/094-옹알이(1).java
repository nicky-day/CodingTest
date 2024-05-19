package org.example.introduction.programmers;

class 옹알이_1 {
    public int solution(String[] babbling) {
        int answer = 0;

        for(int i =0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceFirst("aya", "1");
            babbling[i] = babbling[i].replaceFirst("woo", "1");
            babbling[i] = babbling[i].replaceFirst("ye", "1");
            babbling[i] = babbling[i].replaceFirst("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].isEmpty()) {
                answer = answer + 1;
            }
        }
        return answer;
    }
}

class Main94 {
    public static void main(String[] args) {
        옹알이_1 problem = new 옹알이_1();
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(problem.solution(babbling));
    }
}
