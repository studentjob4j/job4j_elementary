package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] != 'X') {
                   result = false;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == 'X') {
               count++;
            }
        }
        if (count == board.length) {
            result = true;
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X') {
                boolean temp = monoHorizontal(board, index);
                boolean temp2 = monoVertical(board, index);
                if (temp || temp2) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
