package org.example.programmers.brute_force;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class 소수_찾기 {

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private Set<Integer> getPrimes(int acc, List<Integer> numbers) {
        // 종료 조건, 점화식 구현
        Set<Integer> primes = new HashSet<>();
        // 점화식 구현
        if (isPrime(acc)) primes.add(acc);
        // 상태 전이 구현
        for (int i = 0; i < numbers.size(); i++) {
            // numbers.get(i)로 상태 전이 진행
            int nextAcc = acc * 10 + numbers.get(i);
            List<Integer> nextNumbers = new ArrayList<>(numbers);
            nextNumbers.remove(i);
            primes.addAll(getPrimes(nextAcc, nextNumbers));
        }
        return primes;
    }

    private void getPrimes2(int acc, List<Integer> numbers, Set<Integer> primes) {
        if (isPrime(acc)) primes.add(acc);
        for (int i = 0; i < numbers.size(); i++) {
            int nextAcc = acc * 10 + numbers.get(i);
            List<Integer> nextNumbers = new ArrayList<>(numbers);
            nextNumbers.remove(i);
            getPrimes2(nextAcc, nextNumbers, primes);
        }
    }

    public int solution2(String nums) {
        Set<Integer> primes = new HashSet<>();
        List<Integer> numbers = nums.chars()
                .map(c -> c - '0')
                .boxed()
                .toList();

        getPrimes2(0, numbers, primes);
        return primes.size();
    }

    public int solution(String nums) {
        List<Integer> numbers = nums.chars()
                .map(c -> c - '0')
                .boxed()
                .toList();
        return getPrimes(0, numbers).size();
    }

}

class Main4 {
    public static void main(String[] args) {
        소수_찾기 problem = new 소수_찾기();
        String numbers = "17";
        System.out.println(problem.solution(numbers));
    }
}
