package org.example.programmers.string;

class 신규_아이디_추천 {
    public String solution(String newId) {
        // 1단계 : 모든 대문자를 소문자로 치환
        newId = newId.toLowerCase();

        // 2단계 : 알파벳 소문자, 숫자, 밑줄, 마침표를 제외한 문자를 찾아서 제거
        newId = newId.replaceAll("[^a-z0-9\\-_.]", "");

        // 3단계 : 연속된 마침표를 하나의 마침표로 치환한다.
        newId = newId.replaceAll("\\.+", ".");

        // 4단계 : 처음이나 끝에 등장하는 마침표를 제거한다.
        newId = newId.replaceAll("^\\.+|\\.+$", "");

        // 5단계 : 빈 문자열일 경우 "a"를 대입한다.
        if (newId.isEmpty()) newId = "a";

        // 6단계 : 길이 16자 이상이면 앞 15개의 문자만 남기고, 문자열이 .으로 끝난다면 이를 제거해야 한다.
        if (newId.length() >= 16) {
            newId = newId.substring(0, 15);
            newId.replace("\\.+$", "");
        }

        // 7단계 : 문자열 길이가 3이상이 될 때까지 마지막 문자를 이어붙여준다.
        while (newId.length() < 3) {
            newId += newId.charAt(newId.length() - 1);
        }

        return newId;
    }
}

class Main10 {
    public static void main(String[] args) {
        신규_아이디_추천 problem = new 신규_아이디_추천();
        String s = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(problem.solution(s));
    }
}
