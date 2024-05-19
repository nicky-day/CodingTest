package org.example.introduction.programmers;

class 영어가_싫어요 {
    public long solution(String numbers) {
        long answer = 0;
        numbers = numbers.replace("zero", "0");
        numbers = numbers.replace("one", "1");
        numbers = numbers.replace("two", "2");
        numbers = numbers.replace("three", "3");
        numbers = numbers.replace("four", "4");
        numbers = numbers.replace("five", "5");
        numbers = numbers.replace("six", "6");
        numbers = numbers.replace("seven", "7");
        numbers = numbers.replace("eight", "8");
        numbers = numbers.replace("nine", "9");
        answer = Long.parseLong(numbers);
        return answer;
    }
}

class Main77 {
    public static void main(String[] args) {
        영어가_싫어요 problem = new 영어가_싫어요();
        String numbers = "onetwothreefourfivesixseveneightnine";
        System.out.println(problem.solution(numbers));
    }
}
