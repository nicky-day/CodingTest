package org.example.programmers.introduction;

class 안전지대 {
    public int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    if (i-1 >= 0 && board[i-1][j] != 1) {
                        board[i-1][j] = 2;
                    }
                    if (i+1 <= board.length - 1 && board[i+1][j] != 1) {
                        board[i+1][j] = 2;
                    }
                    if (j-1 >= 0 && board[i][j-1] != 1) {
                        board[i][j-1] = 2;
                    }
                    if (j+1 <= board[i].length - 1 && board[i][j+1] != 1) {
                        board[i][j+1] = 2;
                    }
                    if (i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] != 1) {
                        board[i-1][j-1] = 2;
                    }
                    if (i+1 <= board.length - 1 && j+1 <= board[i].length - 1 && board[i+1][j+1] != 1) {
                        board[i+1][j+1] = 2;
                    }
                    if (i-1 >= 0 && j+1 <= board[i].length - 1 && board[i-1][j+1] != 1) {
                        board[i-1][j+1] = 2;
                    }
                    if (i+1 <= board.length - 1 && j-1 >= 0 && board[i+1][j-1] != 1) {
                        board[i+1][j-1] = 2;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}

class Main91 {
    public static void main(String[] args) {
        안전지대 problem = new 안전지대();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        System.out.println(problem.solution(board));
    }
}
