package org.example.introduction.programmers;

class 삼육구게임 {
    public int solution(int order) {
        int result = 0;
        String strOrder = String.valueOf(order);
        for (int i = 0; i < strOrder.length(); i++) {
            if (String.valueOf(strOrder.charAt(i)).equals("3") ||
                    String.valueOf(strOrder.charAt(i)).equals("6") ||
                    String.valueOf(strOrder.charAt(i)).equals("9")) {
                result++;
            }
        }
        return result;
    }
}

class Main59 {
    public static void main(String[] args) {
        삼육구게임 problem = new 삼육구게임();
        int order = 3;
        System.out.println(problem.solution(order));
    }
}
