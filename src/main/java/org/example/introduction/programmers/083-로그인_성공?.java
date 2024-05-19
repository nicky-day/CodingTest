package org.example.introduction.programmers;

class 로그인_성공 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (String[] strings : db) {
            if (id_pw[0].equals(strings[0])) {
                if (id_pw[1].equals(strings[1])) {
                    answer = "login";
                } else {
                    answer = "wrong pw";
                }
                return answer;
            }
        }
        answer = "fail";
        return answer;
    }
}

class Main83 {
    public static void main(String[] args) {
        로그인_성공 problem = new 로그인_성공();
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(problem.solution(id_pw, db));
    }
}
