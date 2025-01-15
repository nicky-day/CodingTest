package org.example.recursion.java_coding_interview;

class 하노이의_탑 {

    public static void moveDisks(int n, char origin, char target, char intermediate) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + origin + " to " + target);
            return;
        }
        moveDisks(n - 1, origin, intermediate, target);
        System.out.println("Move disk " + n + " from " + origin + " to " + target);
        moveDisks(n - 1, intermediate, target, origin);
    }
}

class Main3 {

    public static void main(String[] args) {
        하노이의_탑.moveDisks(3, 'A', 'C', 'B');
    }
}

