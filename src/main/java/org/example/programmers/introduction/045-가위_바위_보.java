package org.example.programmers.introduction;

class 가위_바위_보 {
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            if (String.valueOf(rsp.charAt(i)).equals("2")) {
                answer += "0";
            } else if (String.valueOf(rsp.charAt(i)).equals("0")) {
                answer += "5";
            } else {
                answer += "2";
            }
        }
        return answer;
    }
}

class Main45 {
    public static void main(String[] args) {
        가위_바위_보 problem = new 가위_바위_보();
        System.out.println(problem.solution("205"));
    }
}
