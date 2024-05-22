package org.example.recursion.boj;

import java.util.Scanner;

class 계란으로_계란치기 {
}

class Egg {
    int durability;
    int weight;

    public Egg(int durability, int weight) {
        this.durability = durability;
        this.weight = weight;
    }

    public void fight(Egg other) {
        this.durability -= other.weight;
        other.durability -= this.weight;
    }

    public void restore(Egg other) {
        this.durability += other.weight;
        other.durability += this.weight;
    }
}

class Main8 {

    public static int n;
    public static Egg[] eggs;
    public static int answer = 0;

    public static void solve(int pick) {
        // base case
        if (pick == n) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (eggs[i].durability <= 0) cnt++;
            }
            answer = Math.max(answer, cnt);
            return;
        }

        // recursive case
        // 손에 집은 계란이 아직 깨지지 않은 경우
        // [0:n) 번째 계란을 대상으로 손에 집은 계란과 충돌시킨다.
        if (eggs[pick].durability > 0) {
            boolean targetExist = false;
            for (int target = 0; target < n; target++) {
                if (pick == target) continue;
                if (eggs[target].durability > 0) {
                    targetExist = true;
                    eggs[pick].fight(eggs[target]);
                    solve(pick + 1);
                    eggs[pick].restore(eggs[target]);
                }
            }
            if (!targetExist) solve(pick + 1);
        }
        // 손에 집은 계란이 이미 깨진 경우
        // 오른쪽 계란을 집는다
        else {
            solve(pick + 1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        eggs = new Egg[n];
        for (int i = 0; i < n; i++) {
            eggs[i] = new Egg(sc.nextInt(), sc.nextInt());
        }
        solve(0);
        System.out.println(answer);
    }
}
