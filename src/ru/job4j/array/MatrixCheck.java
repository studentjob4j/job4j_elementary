package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        int count = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] == 'X') {
                   count++;
                }
            }
            if (count == board.length) {
                result = true;
            }

        return result;
    }
}
