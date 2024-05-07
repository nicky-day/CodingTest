package org.example.boj.brute_force;

class 완전_세제곱 {
}

class Main10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            for (int x = 2; x <= 100; x++) {
                for (int y = x + 1; y <= 100; y++) {
                    for (int z = y + 1; z <= 100; z++) {
                        if (i * i * i == (x * x * x + y * y * y + z * z * z)) {
                            System.out.println(String.format("Cube = %d, Triple = (%d,%d,%d)", i, x, y, z));
                        }
                    }
                }
            }
        }
    }
}
